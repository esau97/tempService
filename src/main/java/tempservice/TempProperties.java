package tempservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temp.tipo")
public class TempProperties {
	private String tipo = "F";
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}