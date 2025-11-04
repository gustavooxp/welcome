package com.example.welcome.service;

import com.example.welcome.dto.UsuarioDTO;
import com.example.welcome.model.Usuario;
import com.example.welcome.repository.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO cadastraUsuario(UsuarioDTO usuarioDTO) {
        Usuario novoUsuario = new Usuario();
        BeanUtils.copyProperties(usuarioDTO, novoUsuario);
        return usuarioRepository.save(novoUsuario);
    }
}
