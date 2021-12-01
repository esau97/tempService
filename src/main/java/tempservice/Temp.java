package tempservice;

public class Temp {
	private String tipo;
	
	public Temp(String tipo) {
		this.tipo = tipo;
	}
	
	public String devolverTemp() {
		String temperatura="";
		switch (tipo) {
		case "C":
			temperatura = "Temperatura:" +((40F * 1.8f) + 32);
			break;
		case "F":
			temperatura = "Temperatura:"+((40F - 32) / 1.8f);
			break;
		default:
			temperatura = "4 C";
			break;
		}
		return temperatura;
	}
	
}
