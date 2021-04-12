package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Usuario;
import co.edu.iudigital.app.model.repository.UsuarioRepository;
import co.edu.iudigital.app.service.face.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void create(Usuario user) {
		// TODO : implementar
		
	}

	@Override
	public Usuario login(Usuario user) throws Exception {
		Usuario existsUsuario = usuarioRepository
			 .findByEmailAndPassword(user.getEmail(), user.getPassword());
		if ( existsUsuario == null ) {
			throw new Exception ("Usuario y/o contraseña invalida!");
			
		}
		return existsUsuario;
	}

		
}
