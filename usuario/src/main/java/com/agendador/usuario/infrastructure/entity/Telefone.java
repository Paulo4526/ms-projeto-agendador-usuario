package com.agendador.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

//Utilizando o Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Utilizando o JPA(Java Persistence API) para persistencia de dados no banco de dados
@Entity
@Table(name = "telefone")
public class Telefone {

    //Criando o atributo e suas especificidades que serão criadas na tabela do nosso banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "numero", nullable = false)
    private Integer numero;
    @Column(name = "ddd", nullable = false)
    private Integer ddd;
}
