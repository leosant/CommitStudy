package com.commitStudy.demo.dto;

import com.commitStudy.demo.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private String id;
    private String name;
    private String Email;

    public UserDTO(User obj){
        this.id = obj.getId();
        this.name = obj.getName();
        this.Email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email)

    {
        Email = email;
    }
}
