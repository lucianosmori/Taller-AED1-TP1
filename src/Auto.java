public class Auto extends Vehiculo{
	private String airbags;
	
	 public String toString(){
	        return super.toString();
	    }	
	 public Auto (String vin, float motorLitros, int motorCilindradas, String contenido){
		 super(vin,motorLitros,motorCilindradas);
	     this.setContenido(contenido);
	 }
	
	public String getContenido() {
		return airbags;
	}
	public void setContenido(String contenido) {
		this.airbags = contenido;
	}
}
