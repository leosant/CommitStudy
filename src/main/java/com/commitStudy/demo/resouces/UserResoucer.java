package com.commitStudy.demo.resouces;

import com.commitStudy.demo.domain.User;
import com.commitStudy.demo.dto.Services.UserServices;
import com.commitStudy.demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping (value = "/users")
public class UserResoucer {

    @Autowired
    private UserServices service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(vs -> new UserDTO((User) vs)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
        Optional<User> obj = service.findById(id);
        return ResponseEntity.ok().body(new UserDTO(obj));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> Insert(@RequestBody UserDTO ObjDTO) {
        User Obj = service.fromDTO(ObjDTO);
        Obj = service.insert(Obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(Obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}

