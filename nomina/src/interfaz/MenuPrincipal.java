package interfaz;
import java.util.Scanner;
public class MenuPrincipal {

	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		 int opcion=0;
	        System.out.println("\nBienvenido");
	        while(opcion!=3){
	            System.out.println("1.Registrar los datos del trabajador");
	            System.out.println("2.Realizar calculos de nomina");
	            System.out.println("3.Salir");
	            System.out.println("Opcion: ");
	            opcion = scan.nextInt();
	            
	            switch(opcion) {
	            
	            case 1:
	            	MenuNomina n = new MenuNomina();
	            	n.MenuNomina();
	            	break;
	            case 2:
	            	MenuNomina no = new MenuNomina();
	            	no.mostrar();
	            	break;
	            case 3:
	            	System.out.println("Gracias por usar el programa");
	            	System.exit(0);
	        
	            break;
	            
	            default:
	            	System.err.println("Seleccione una opcion correcta\n");
	            	break;
	            }
	        }
	}
	
}
