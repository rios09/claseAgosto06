package DataAccess;
import java.io.Serializable;
import java.text.DecimalFormat;
public class Data implements Serializable{
	
	
	
	private String nombre;
	private double salarioBasico;
	private double horasExtras;
	private int añosLaborados;
	private double ingresosHorasExtras;
	private double ingresosVacaciones;
	private double ingresosAntiguedad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getIngresosHorasExtras() {
		return ingresosHorasExtras;
	}
	public void setIngresosHorasExtras(double ingresosHorasExtras) {
		this.ingresosHorasExtras = ingresosHorasExtras;
	}
	public double getIngresosVacaciones() {
		return ingresosVacaciones;
	}
	public void setIngresosVacaciones(double ingresosVacaciones) {
		this.ingresosVacaciones = ingresosVacaciones;
	}
	public double getIngresosAntiguedad() {
		return ingresosAntiguedad;
	}
	public void setIngresosAntiguedad(double ingresosAntiguedad) {
		this.ingresosAntiguedad = ingresosAntiguedad;
	}
	public int getAñosLaborados() {
		return añosLaborados;
	}
	public void setAñosLaborados(int añosLaborados) {
		this.añosLaborados = añosLaborados;
	}
	private double vacaciones;
	private double zonaje;
	private double comisiones;
	private double remuneracionBruta;
	private double inss;
	private double ir;
	private double totalDeducciones;
	private double remuneracionNeta;
	private double inssPatronal;
	private double inatec;
	private double totalImpuestos;
	private double aguinaldo;
	private double granTotal;
	public double getSalarioBasico() {
		return salarioBasico;
	}
	public void setSalarioBasico(double salarioBasico) {
		this.salarioBasico = salarioBasico;
	}
	public double getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	public double getVacaciones() {
		return vacaciones;
	}
	public void setVacaciones(double vacaciones) {
		this.vacaciones = vacaciones;
	}
	public double getZonaje() {
		return zonaje;
	}
	public void setZonaje(double zonaje) {
		this.zonaje = zonaje;
	}
		public double getComisiones() {
		return comisiones;
	}
	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}
	public double getRemuneracionBruta() {
		return remuneracionBruta;
	}
	public void setRemuneracionBruta(double remuneracionBruta) {
		this.remuneracionBruta = remuneracionBruta;
	}
	public double getInss() {
		return inss;
	}
	public void setInss(double inss) {
		this.inss = inss;
	}
	public double getIr() {
		return ir;
	}
	public void setIr(double ir) {
		this.ir = ir;
	}
	public double getTotalDeducciones() {
		return totalDeducciones;
	}
	public void setTotalDeducciones(double totalDeducciones) {
		this.totalDeducciones = totalDeducciones;
	}
	public double getRemuneracionNeta() {
		return remuneracionNeta;
	}
	public void setRemuneracionNeta(double remuneracionNeta) {
		this.remuneracionNeta = remuneracionNeta;
	}
	public double getInssPatronal() {
		return inssPatronal;
	}
	public void setInssPatronal(double inssPatronal) {
		this.inssPatronal = inssPatronal;
	}
	public double getInatec() {
		return inatec;
	}
	public void setInatec(double inatec) {
		this.inatec = inatec;
	}
	public double getTotalImpuestos() {
		return totalImpuestos;
	}
	public void setTotalImpuestos(double totalImpuestos) {
		this.totalImpuestos = totalImpuestos;
	}
	public double getAguinaldo() {
		return aguinaldo;
	}
	public void setAguinaldo(double aguinaldo) {
		this.aguinaldo = aguinaldo;
	}
	public double getGranTotal() {
		return granTotal;
	}
	public void setGranTotal(double granTotal) {
		this.granTotal = granTotal;
	}
	@Override
	public String toString() {
		
		return  String.format("%30s %10s %25.2f %10s %20s %10s %25.2f %10s %10s %10s %25.2f %10s %25s %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s %25.2f %10s", 
				nombre, "|", salarioBasico, "|", horasExtras, "|", ingresosHorasExtras, "|", vacaciones, "|",
				ingresosVacaciones, "|", añosLaborados, "|", ingresosAntiguedad, "|", zonaje, "|", comisiones, "|", remuneracionBruta, "|", inss, "|", ir, "|", totalDeducciones, "|", remuneracionNeta, "|",
				inssPatronal, "|", inatec, "|", totalImpuestos, "|", aguinaldo, "|", granTotal, "|"); 
	}
	
	
	
	
	
	
	
	
	
	


}
