package cl.ejemplo.ejemplo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ejemplo.ejemplo2.dao.RepositorioUsuario;
import cl.ejemplo.ejemplo2.model.Usuario;

@Service
public class ImplementaServicioUsaurio implements ServicioUsuario {

	@Autowired
	protected RepositorioUsuario repositorioUsuario;

	@Override
	public Usuario save(Usuario usuario) {
		return this.repositorioUsuario.save(usuario);
	}
}
