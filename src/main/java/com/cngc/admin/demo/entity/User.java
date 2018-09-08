package com.cngc.admin.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GenericGenerator(name ="system-uuid", strategy ="uuid")
    @GeneratedValue(generator="system-uuid")
    private String id;

    @Column
    private String userName;

    @Column
    private Integer age;
}
