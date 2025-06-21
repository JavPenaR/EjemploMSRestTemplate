package com.ventas.ventas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {

    private Integer id;

    private String nombre;
    private String apPaterno;
    private String apMaterno;

    private String run;

    private String mail;

    private String rol;

}
