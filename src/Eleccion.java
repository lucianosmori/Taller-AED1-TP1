public class Eleccion {
	
	int opcionIngresada;
	
	public Eleccion(){
		
	}
	
	public Eleccion(int opcionIngresada) throws EleccionException{
		if(opcionIngresada <= 1 && opcionIngresada >= 2){
			throw new EleccionException("Error");
		}	else{
			this.opcionIngresada = opcionIngresada;
		}
	}
    }
