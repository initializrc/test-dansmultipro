package com.test.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersistenceModel {

    // @NotNull
    // private Integer id;

    @NotNull
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "GMT+7")
    private Date created_at;

}
