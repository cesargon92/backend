package cl.ejemplo.ejemplo2.service;

import java.util.List;

import cl.ejemplo.ejemplo2.model.Usuario;

public interface ServicioUsuario {

	/**
	 * guarda un usuarios
	 * @param usuario
	 * @return usuario guardado
	 */
	Usuario save(Usuario usuario);

	/**
	 * método que retorna todos los usuarios en la base de datos
	 * @return lista de usuarios
	 */
	List<Usuario> findAll();

	/**
	 * método para eliminar usuario según id recibido
	 * @param idUsaurio
	 */
	void deleteUser(Integer idUsaurio);


}
