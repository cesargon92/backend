package cl.ejemplo.ejemplo2.util;

public class RestResponse {

	private Integer codigoResponse;
	private String mensajeResponse;
	
	public RestResponse(Integer codigoResponse) {
		this.codigoResponse = codigoResponse;
	}
	
	public RestResponse(Integer codigoResponse, String mensajeResponse) {
		this.codigoResponse = codigoResponse;
		this.mensajeResponse = mensajeResponse;
	}



	public Integer getCodigoResponse() {
		return codigoResponse;
	}
	public void setCodigoResponse(Integer codigoResponse) {
		this.codigoResponse = codigoResponse;
	}
	public String getMensajeResponse() {
		return mensajeResponse;
	}
	public void setMensajeResponse(String mensajeResponse) {
		this.mensajeResponse = mensajeResponse;
	}
	
	
	
	
	
	
}
