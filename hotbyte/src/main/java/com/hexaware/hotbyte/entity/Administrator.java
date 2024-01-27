package com.hexaware.hotbyte.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administrator")
public class Administrator {

    @Id
    @Column(name = "AdminID")
    private int adminId;

    @Column(name = "UserName", nullable = false, unique = true)
    private String userName;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email", unique = true)
    private String email;

   
}
