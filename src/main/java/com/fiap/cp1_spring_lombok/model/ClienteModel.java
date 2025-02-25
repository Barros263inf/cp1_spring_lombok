package com.fiap.cp1_spring_lombok.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

}
