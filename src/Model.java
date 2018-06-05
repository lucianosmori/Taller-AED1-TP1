import java.util.Scanner;
public class Model {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcionIngresada;
        int opcionOperar;
        int i;
        int cantidadauto = 0;
        int cantidadmoto = 0;
        int numeroSeleccionado;
        String vin;
        
        Auto [] automovil = new Auto [10];
        Moto [] motocicleta = new Moto [10];
        System.out.println("Bienvenido");    
        do{
            System.out.println("1.Operar");
            System.out.println("0.Salir");
            opcionIngresada = sc.nextInt();
            sc.nextLine();
            
           try{
            	ele = new Eleccion(opcionIngresada);         
            }catch (EleccionException e){
            	e.printStackTrace();
            }finally {
            	System.out.println("Opcion "+opcionIngresada+" elegida");
            }
            
            switch (opcionIngresada) {
                case 1:
                    do{
                        System.out.println("\nHa seleccionado Operar");
                        System.out.println("1.Registrar auto");
                        System.out.println("2.Registrar moto");
                        System.out.println("3.Borrar auto registrado");
                        System.out.println("4.Borrar moto registrado");
                        System.out.println("5.Listar auto");
                        System.out.println("6.Listar moto");
                        System.out.println("0.Volver");
                        opcionIngresada=sc.nextInt();
                        sc.nextLine();
                        
                        switch (opcionIngresada) {
                        case 1:
                            System.out.println("\nIngrese el vin del auto");
                            vin = sc.nextLine();
                            System.out.println("\nEscriba Si/No de acuerdo si posee airbags el auto ");
                            String airbags = sc.nextLine();
                            Auto nuevoAuto = new Auto(vin,airbags);
                                if (cantidadauto < automovil.length){
                                    automovil[cantidadauto]= nuevoAuto;
                                    System.out.println("\nSe ha agregado el automovil con el vin:"+vin+" y "+airbags+" contiene airbags");
                                    cantidadauto++;
                                }
                            break;
                        case 2:
                            System.out.println("\nIngrese el vin de la moto");
                            vin = sc.nextLine();
                            System.out.println("\nEscriba Si/No de acuerdo si posee encendido electronico la moto ");
                            String encendidoElectronico = sc.nextLine();
                            Moto nuevoMoto = new Moto(vin,encendidoElectronico);
                                if (cantidadmoto < motocicleta.length){
                                    motocicleta[cantidadmoto]= nuevoMoto;
                                    System.out.println("se ha agregado la motocicleta con el vin:"+vin+" y "+encendidoElectronico+" tiene encendido electronico");
                                    cantidadmoto++;
                                }
                            break;
                        case 3:
                            System.out.println("\nLista para borrar autos");
                            System.out.println("Procedemos a mostrar la lista de registrados");
                            for (i=0; (automovil[i]!= null) ; i++){
                                System.out.println(i+" Vin: "+automovil[i].getVin()+" y "+automovil[i].getContenido()+" posee airbag\n" );
                            }
                            System.out.println("Seleccione el numero del auto a eliminar");
                            numeroSeleccionado=sc.nextInt();
                            
                            for (i=0; i<automovil.length; i++)
                                if (i == numeroSeleccionado){
                                    for (int j = i; j < automovil.length - 1; j++) {
                                        automovil[j] = automovil[j+1];
                                }  automovil[automovil.length-1] = null;
                                }
                            break;
                        case 4:
                            System.out.println("\nLista para borrar motos");
                            System.out.println("\nProcedemos a mostrar la lista de registrados");
                            for (i=0; (motocicleta[i]!= null) ; i++){
                                System.out.println(i+" Vin: "+motocicleta[i].getVin()+" y "+motocicleta[i].getContenido()+" posee encendido electronico\n" );
                            }
                            System.out.println("Seleccione el numero de la moto a eliminar");
                            numeroSeleccionado=sc.nextInt();
                            
                            for (i=0; i<motocicleta.length; i++)
                                if (i == numeroSeleccionado){
                                    for (int j = i; j < motocicleta.length - 1; j++) {
                                        motocicleta[j] = motocicleta[j+1];
                                }  motocicleta[motocicleta.length-1] = null;
                                }
                            break;
                        case 5:
                            System.out.println("\nLista de autos registrados");
                            for (i=0; (automovil[i]!= null) ; i++){
                                System.out.println(i+" Vin: "+automovil[i].getVin()+" y "+automovil[i].getContenido()+" posee airbag\n" );
                                //System.out.println("\n");
                            }
                            break;
                        case 6:
                            System.out.println("\nLista de motos registrados");
                            for (i=0; (motocicleta[i]!= null) ; i++){
                                System.out.println(i+" Vin: "+motocicleta[i].getVin()+" y "+motocicleta[i].getContenido()+" posee encendido electronico\n" );
                                //System.out.println("\n");
                            }
                            break;
                         default:
                             throw new AssertionError();
                         case 0:   
                             System.out.println("\tVolviendo a menu principal\n");
                             break;
                        }
                    }while (opcionIngresada != 0);
                    
                case 2:
                    System.out.println("Ha seleccionado terminar");
                    break;
                default:
                    break;
            }    
            
        }while (opcionOperar != 0);
        System.out.println("\t<SALIÓ>\nTenga buen día :)");
    }
}
