package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.entity.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserModel extends PersistenceModel {

    private User.Type type;
    private String url;
    private String company;
    private String company_url;
    private String location;
    private String title;
    private String description;
    private String how_to_apply;
    private String company_logo;
}
