package br.com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
