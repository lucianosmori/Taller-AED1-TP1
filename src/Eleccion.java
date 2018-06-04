public class Eleccion {
    
    public Eleccion(){
        
    }
    
    public void excepcionEleccion(int opcionIngresada) throws EleccionException{
        if(opcionIngresada != (1&2)){
            throw new EleccionException("Error al Ingresar el numero");
        }
    }
}