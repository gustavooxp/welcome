package com.example.welcome.repository;

import com.example.welcome.dto.UsuarioDTO;
import com.example.welcome.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
