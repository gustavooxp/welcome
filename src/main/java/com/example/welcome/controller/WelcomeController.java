package com.example.welcome.controller;

import com.example.welcome.dto.MensagemWelcome;
import com.example.welcome.dto.UsuarioDTO;
import com.example.welcome.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WelcomeController {

    @Autowired
    private UsuarioService service;
    
    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrarUsuario(@RequestBody UsuarioDTO usuarioDto) {
        try{
            service.cadastraUsuario(usuarioDto);
            String mensagemSucesso = "Usuario" + usuarioDto.nome() + " cadastrado com sucesso!";
            return ResponseEntity.status(HttpStatus.OK).body(mensagemSucesso);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao cadastrar" + e.getMessage());
        }
    }

}
