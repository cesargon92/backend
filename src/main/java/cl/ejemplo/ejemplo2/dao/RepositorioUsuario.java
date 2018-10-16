package cl.ejemplo.ejemplo2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ejemplo.ejemplo2.model.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Integer>{
	
	@SuppressWarnings("unchecked")
	Usuario save(Usuario usuario);

}
