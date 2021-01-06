package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name="user")
public class User extends Persistence{

    public enum Type {
        FULLTIME, CONTRACT;
    }

    @NotNull
    private String username;

    @JsonIgnore
    @NotNull
    @Size(min = 8)
    @Column
    private String password;

    @Column(length = 100)
    private String url;

    @Column(length = 100)
    private String company;

    @Column(length = 100)
    private String company_url;

    @Column(length = 100)
    private String location;

    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    @Column(length = 250)
    private String how_to_apply;

    @Column(length = 250)
    private String company_logo;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private Type type;
}
