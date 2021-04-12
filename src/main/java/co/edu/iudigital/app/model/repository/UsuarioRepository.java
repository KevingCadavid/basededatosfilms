package co.edu.iudigital.app.model.repository;
import org.springframework.data.repository.CrudRepository;
import co.edu.iudigital.app.model.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
public Usuario findByEmailAndPassword(String email, String password);
}