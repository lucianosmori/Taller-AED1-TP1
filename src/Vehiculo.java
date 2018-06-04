public abstract class Vehiculo {
    private String vin;
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
     public String toString(){
            return vin;
        }
    public Vehiculo(String vin){
        this.vin = vin;
    }    
}