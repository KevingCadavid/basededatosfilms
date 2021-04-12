package co.edu.iudigital.app.service.face;

import co.edu.iudigital.app.model.entity.Usuario;

public interface UsuarioService {

	/**
	*Crear nuevo usuario
	*@param user
	*/
	public void create (Usuario user);
	/**
	 * Loguea un usuario
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public Usuario login ( Usuario user) throws Exception;
	
}
