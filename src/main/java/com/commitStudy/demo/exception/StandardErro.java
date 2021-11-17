package com.commitStudy.demo.exception;

import java.io.Serializable;

public class StandardErro implements Serializable {

    private Long Timestamp;
    private Integer status;
    private String Erro;
    private String message;
    private String path;

    public StandardErro(){
    }

    public StandardErro(Long timestamp, Integer status, String erro, String message, String path) {
        this.Timestamp = timestamp;
        this.status = status;
        this.Erro = erro;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Long timestamp) {
        Timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErro() {
        return Erro;
    }

    public void setErro(String erro) {
        Erro = erro;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
