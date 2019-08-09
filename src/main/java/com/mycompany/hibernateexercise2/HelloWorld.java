/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernateexercise2;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vishal
 */
@Entity
@Table(name = "message")
public class HelloWorld {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "message")
    private String Message;

    public HelloWorld() {
    }

    public HelloWorld(int id, String Message) {
        this.id = id;
        this.Message = Message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    @Override
    public String toString() {
        return "message{" + "id=" + id + ", Message=" + Message + '}';
    }

}
