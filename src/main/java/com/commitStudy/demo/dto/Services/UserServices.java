package com.commitStudy.demo.dto.Services;

import java.util.List;
import java.util.Optional;

import com.commitStudy.demo.domain.User;
import com.commitStudy.demo.repository.UserRepository;
import com.commitStudy.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
    public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public Optional<User> findById(String id) {
        Optional<User> user = repo.findById(id);
            if (user == null) {
                throw new ObjectNotFoundException("Objeto não encontrado");
        }
            return user;
    }
}


