package br.com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.entity.Usuario;
import br.com.crud.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Criar Usuários
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	//Listar todos os Usuários
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	// Buscar usuário por ID
	public Optional<Usuario> buscarUsuarioPorId(Long id){
		return usuarioRepository.findById(id);
	}
	//Atualizar usuário
}
