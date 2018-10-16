package cl.ejemplo.ejemplo2.controller;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.ejemplo.ejemplo2.model.Usuario;
import cl.ejemplo.ejemplo2.service.ServicioUsuario;
import cl.ejemplo.ejemplo2.util.RestResponse;

@RestController
public class UsuarioController {

	@Autowired
	protected ServicioUsuario servicioUsuario;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/setOrUpdate", method=RequestMethod.POST)
	public RestResponse setOrUpdate(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		Usuario usuario = this.mapper.readValue(userJson, Usuario.class);
		
		if(!validador(usuario)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), 
					"Existen Datos Obligatorios que no han sido ingresados");
		}
		else {
			this.servicioUsuario.save(usuario);
			return new RestResponse(HttpStatus.OK.value(), "Operación Exitosa");
		}
		
	}
	
	@RequestMapping(value="/obtenerUsuarios", method=RequestMethod.GET)
	public List<Usuario> obtenerUsuarios(){
		return this.servicioUsuario.findAll();
	}
	
	private boolean validador(Usuario usuario) {
		
		boolean validado = true;
		
		if(StringUtils.trimToNull(usuario.getPrimerNombre()) == null) {
			validado = false;
		}
		
		if(StringUtils.trimToNull(usuario.getApellidoPaterno()) == null) {
			validado = false;
		}
		
		if(StringUtils.trimToNull(usuario.getDireccion()) == null) {
			validado = false;
		}
		
		return validado;
	}
}
