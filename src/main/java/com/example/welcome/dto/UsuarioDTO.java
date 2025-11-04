package com.example.welcome.dto;

public record UsuarioDTO(
        String nome,
        String email,
        String senha,
        String telefone,
        String dataNascimento
) {
}
