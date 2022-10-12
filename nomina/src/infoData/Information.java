package infoData;
import DataAccess.Data;

public class Information extends Data {
	

	 public  static double ingresosHorasExtras(double salarioBasico, double horasExtras){
	        
	        return ((salarioBasico/30)/8*horasExtras)*2;
	    }
	    
	    public static double ingresos_vacaciones(double salarioBasico, double diasAcumulados){
	        
	        return (salarioBasico/30)*diasAcumulados;
	    }
	    
	    public static double antiguedad(double salarioBasico,int aniosAntiguedad){
	    	double antiguedad=0;
	        switch(aniosAntiguedad) {
	        
	            case 1:
	               antiguedad = salarioBasico * 0.03;
	                break;
	            case 2:
	               antiguedad = salarioBasico * 0.05;
	                break;
	            case 3:
	                antiguedad = salarioBasico * 0.07;
	                break;
	            case 4:
	                antiguedad = salarioBasico * 0.09;
	                break;
	            case 5:
	                antiguedad = salarioBasico * 0.1;
	                break;
	            case 6:
	                antiguedad = salarioBasico * 0.011;
	                break;
	            case 7:
	                antiguedad = salarioBasico * 0.12;
	                break;
	            case 8:
	                antiguedad = salarioBasico * 0.13;
	                break;
	            case 9:
	                antiguedad = salarioBasico * 0.14;
	                break;
	            case 10:
	                antiguedad = salarioBasico * 0.15;
	                break;
	            case 11:
	                antiguedad = salarioBasico * 0.155;
	                break;
	            case 12:
	                antiguedad = salarioBasico * 0.16;
	                break;
	            case 13:
	                antiguedad = salarioBasico * 0.165;
	                break;
	            case 14:
	                antiguedad = salarioBasico * 0.17;
	                break;
	            case 15:
	                antiguedad = salarioBasico * 0.175;
	                break;
	            case 16:
	                antiguedad = salarioBasico * 0.18;
	                break;
	            case 17:
	                antiguedad = salarioBasico * 0.185;
	                break;
	            case 18:
	                antiguedad = salarioBasico * 0.19;
	                break;
	            case 19:
	                antiguedad = salarioBasico * 0.195;
	                break;
	            case 20:
	                antiguedad = salarioBasico * 0.2;
	                break;
	        }
	        if (aniosAntiguedad > 20) {
	            antiguedad = 0.2*salarioBasico;
	            
	        }
	        
	        
	        return antiguedad;
	    }
	
	
	    public static double remuneracionBruta(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
	    	
	    	return salarioBasico + ingresosHorasExtras(salarioBasico, horasExtras) + ingresos_vacaciones(salarioBasico, diasAcumulados) + antiguedad(salarioBasico, aniosAntiguedad
	    			) + zonaje + comisiones;
	    }
	
	
	
	public static double inss(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
		
		return remuneracionBruta(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones) * 0.07;
	}
	
		public static double ir(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
			double monto = (remuneracionBruta(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones) - inss(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones)) ;
			double expectativaAnual = monto * 12;
			double irMensual=0;
			
			
			
			if(expectativaAnual >=0.01 && expectativaAnual <=100000) {
				irMensual=0;
			}
			if(expectativaAnual >=100001 && expectativaAnual <=200000) {
				double deducible = monto - 100000;
				double porcentaje = deducible * 0.15;
				irMensual = porcentaje / 12;
			}
			
			if(expectativaAnual>= 200001 && expectativaAnual <= 350000) {
				double deducible = expectativaAnual - 200000;
				double porcentaje = deducible * 0.20;
				double impuestoBase =  porcentaje + 15000;
				irMensual = impuestoBase / 12;
					}
			
			if(expectativaAnual>= 350001 && expectativaAnual <= 500000) {
				double deducible = expectativaAnual - 350000;
				double porcentaje = deducible * 0.25;
				double impuestoBase=  porcentaje + 45000;
				irMensual= impuestoBase / 12;
			}
			if(expectativaAnual>= 500001) {
			double deducible = expectativaAnual - 500000;
				double porcentaje = deducible * 0.30;
				double impuestoBase=  porcentaje + 82500;
				irMensual = impuestoBase / 12;
			}
			
			return irMensual;
		}
		
	public static double totalDeducciones(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
		return inss(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones) + ir(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones);
	}
	
	public static double remuneracionNeta(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
		
		return remuneracionBruta(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones) - totalDeducciones(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones);
				
	}
	
	public static double inssPatronal(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
	
		return remuneracionBruta(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones)*0.215;
		
	}
	
	public static double inatec(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
		
		return remuneracionBruta(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones) * 0.02; 
	}
	
	public static double totalImpuestos(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
		
	return inatec(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones) + inssPatronal(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones);	
		
	}
	
	
	public static double aguinaldo(double salarioBasico) {
		return salarioBasico / 12;
	}
	
	
	
	public static double totalPago(double salarioBasico, double horasExtras, double diasAcumulados, int aniosAntiguedad, double zonaje, double comisiones) {
		
	return 	remuneracionNeta(salarioBasico, horasExtras, diasAcumulados, aniosAntiguedad, zonaje, comisiones) + aguinaldo(salarioBasico);
	}
	
	
}
