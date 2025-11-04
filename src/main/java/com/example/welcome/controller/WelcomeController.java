package com.example.welcome.controller;

import com.example.welcome.dto.MensagemWelcome;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WelcomeController {

    @GetMapping("/mensagem")
    public MensagemWelcome getMensagem() {
        return new MensagemWelcome("Este é o backend do Gustavo");
    }

    @GetMapping("/cadastrar")
    public MensagemWelcome getCadastrar() {
        return new MensagemWelcome("Esta é a mensagem do cadastro");
    }

    @GetMapping("/consultar")
    public MensagemWelcome getConsultar() {
        return new MensagemWelcome("Esta é a mensagem da consulta");


    }


}
