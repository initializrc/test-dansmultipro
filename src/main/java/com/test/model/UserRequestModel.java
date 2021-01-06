package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.util.FieldValueMatch;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldValueMatch.List({
        @FieldValueMatch(
                field = "password",
                fieldMatch = "verifyPassword",
                message = "password must match"
        )
})
public class UserRequestModel {

    @NotBlank
    private String password;

    @NotBlank
    private String verifyPassword;

    @NotBlank
    private String username;

    @NotBlank
    private String type;

    @NotBlank
    private String url;

    @NotBlank
    private String company;

    @NotBlank
    private String company_url;

    @NotBlank
    private String location;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String how_to_apply;

    @NotBlank
    private String company_logo;

}


