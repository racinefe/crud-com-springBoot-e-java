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
	public Usuario atualizarUsuario(Long id, Usuario usuarioAtualizado) {
		Usuario usuario = usuarioRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Usuário não Encontrado"));
		usuario.setNome(usuarioAtualizado.getNome());
		usuario.setIdade(usuarioAtualizado.getIdade());
		usuario.setEmail(usuarioAtualizado.getEmail());
		return usuarioRepository.save(usuario);
	}
	//Deletar Usuário
}
