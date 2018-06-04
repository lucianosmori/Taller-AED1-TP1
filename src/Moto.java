public class Moto extends Vehiculo{
    private String encendidoElectronico;
     public String toString(){
            return super.toString();
        }    
     public Moto (String vin, String contenido){
         super(vin);
         this.setContenido(contenido);
     }
    public String getContenido() {
        return encendidoElectronico;
    }
    public void setContenido(String contenido) {
        this.encendidoElectronico = contenido;
    }
}