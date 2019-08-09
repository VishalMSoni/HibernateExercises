package com.mycompany.hibernateexercise3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author vishal
 */
@Entity
@Table(
        name = "userprofile",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"name", "phone"})
        })
public class Userprofile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private int id;

    @Id
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "email")
    private String email;

    @Id
    @Basic(optional = false)
    @Column(name = "phone")
    private long phone;

    public Userprofile() {
    }

    public Userprofile(int id, String name, String email, long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Userprofile{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

}
