package com.example.welcome.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // 1. Diz ao Spring que esta classe é uma "entidade" (tabela)
@Table(name = "usuarios") // 2. O nome da tabela no banco
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    @Id // 3. Define que este é o campo de Chave Primária (ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 4. Diz ao MySQL para autoincrementar o ID
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String dataNascimento;

}

