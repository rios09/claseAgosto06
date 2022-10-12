package interfaz;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import DataAccess.Data;
import infoData.Information;
import saveData.DataSave;

import java.util.Scanner;
public class MenuNomina {

	
	 Scanner scan= new Scanner(System.in);
	
	
	
	public void opc() {
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Agregar  empleado");
		System.out.println("2. Guardar los empleados que tiene hasta el momento");
	}
	
	
	public short validar() {
		short option = scan.nextShort();
		
		while(option <1 || option >2) {
			System.err.println("Seleccione una opcion correcta\n");
			opc();
			option = scan.nextShort();
		}
		
		return option;
	}
	
	
	
	
	
	
	public void MenuNomina() {
		opc();
		short a = validar();
		
	 	List <Data>data = new ArrayList<Data>();
		while(a ==1 ) {
		
				Data d = new Data();
		            	
		          
		        System.out.println("\nInformacion de datos de trabajadores");
		        
		        System.out.println("1.Introduzca su nombre completo: ");
		        d.setNombre(scan.next());
		        System.out.println("2.Ingrese su salario basico: ");
		        d.setSalarioBasico(scan.nextDouble());
		        System.out.println("3.Ingrese Años laborados del trabajador: ");
		        d.setAñosLaborados(scan.nextInt());
		        System.out.println("4.Ingrese bonos de transporte: ");
		        d.setZonaje(scan.nextDouble());
		        System.out.println("5.Ingrese dias de vacaciones acumuladas: ");
		        d.setVacaciones(scan.nextDouble());
		        System.out.println("6.Ingrese comisiones: ");
		        d.setComisiones(scan.nextDouble());
		        System.out.println("7.Ingrese horas extras del trabajador");
		        d.setHorasExtras(scan.nextDouble());
		        
		        d.setIngresosHorasExtras(Information.ingresosHorasExtras(d.getSalarioBasico(), d.getHorasExtras()));
		        d.setIngresosVacaciones(Information.ingresos_vacaciones(d.getSalarioBasico(), d.getVacaciones()));
		        d.setIngresosAntiguedad(Information.antiguedad(d.getSalarioBasico(), d.getAñosLaborados()));
		        d.setRemuneracionBruta(Information.remuneracionBruta(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setInss(Information.inss(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setIr(Information.ir(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setTotalDeducciones(Information.totalDeducciones(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setRemuneracionNeta(Information.remuneracionNeta(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setInssPatronal(Information.inssPatronal(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setInatec(Information.inatec(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setTotalImpuestos(Information.totalImpuestos(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        d.setAguinaldo(Information.aguinaldo(d.getSalarioBasico()));
		        d.setGranTotal(Information.totalPago(d.getSalarioBasico(), d.getHorasExtras(), d.getVacaciones(), d.getAñosLaborados(), d.getZonaje(), d.getComisiones()));
		        
		        data.add(d);
		        opc();
		        a = validar();
		        
		        System.out.print(data.size());
		        System.out.print("\n");
		}
		        
				if(a==2) {
					DataSave s = new DataSave();
					s.setData(data);
					System.out.println("Indica la ruta y el nombre que llevara este archivo: ");
					s.save(scan.next());
				}
		
				
				
					
				}

	
	
	
	public void mostrar() {
	DataSave s = new DataSave();
	List<Data>data = null;
	System.out.println("Indique la ruta y el nombre con el cual se guardo el archivo");
	data = s.getData(scan.next());
	System.out.print("\n");
	System.out.println(String.format("%30s %10s %25s %10s %20s %10s %25s %10s %10s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s %25s %10s", 
			"Nombre", "|", "Salario Basico", "|", "Horas Extras", "|", "Ingresos por H. Extras", "|", "Dias", "|", "Ingresos por Vacaciones", "|", "Años Laborados", "|", "Ingresos por Antiguedad", "|",
			"Zonaje", "|", "Comisiones", "|", "Remuneracion Bruta", "|", "INSS Laboral", "|", "IR", "|", "Total Deducciones", "|", "Remuneracion Neta", "|", "INSS Patronal", "|", "INATEC", "|", "TOTAL Impuestos", "|", "Aguinaldo", "|", "TOTAL a Pagar", "|"));
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
			+ "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	for(Data p: data){
	System.out.println(p.toString());
	}
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
			+ "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	}
			
	       
		        

		        
		     
	
	

	
	
		        
	

	
	

