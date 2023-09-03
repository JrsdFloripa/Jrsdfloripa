package com.example.academia.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Aluno {
    @Id
    private long codigo;
    private String nome;
    private double peso;
    private int idade;
    private long cpf;
    @ManyToOne
    private Administracao matricula;
}
