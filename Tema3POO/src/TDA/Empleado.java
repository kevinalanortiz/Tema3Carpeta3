package TDA;

public class Empleado {

	private String NomEmp;
	private byte EdadEmp;
	private byte HrsTrabEmp;
	private double PagoHrsEmp;
	private static byte Conta=0;
	private  int cveEmpleado=0;
	private static int inicial=1000;
	
	
//public Empleado () {}
public Empleado (String NomEmp,byte EdadEmp,byte HrsTrabEmp,double PagoHrsEmp ) {
	
	this.NomEmp=NomEmp;
	this.EdadEmp=EdadEmp;
	this.HrsTrabEmp=HrsTrabEmp;
	this.PagoHrsEmp=PagoHrsEmp;
	this.cveEmpleado=inicial;
	Conta++;
	inicial+=2;
}
public String getNomEmp() {
	return NomEmp;
}
public void setNomEmp(String nomEmp) {
	NomEmp = nomEmp;
}
public byte getEdadEmp() {
	return EdadEmp;
}
public void setEdadEmp(byte edadEmp) {
	EdadEmp = edadEmp;
}
public byte getHrsTrabEmp() {
	return HrsTrabEmp;
}
public void setHrsTrabEmp(byte hrsTrabEmp) {
	HrsTrabEmp = hrsTrabEmp;
}

public static byte getConta() {
	return Conta;
}

public double getPagoHrsEmp() {
	return PagoHrsEmp;
}
public void setPagoHrsEmp(double pagoHrsEmp) {
	PagoHrsEmp = pagoHrsEmp;
}
	
public String toString() {
	
	return "Su CVE es de "+cveEmpleado+"Su Nombre es: "+NomEmp+" con "+EdadEmp+" años"+"\n"+"Usted trabajo "+HrsTrabEmp+"hrs"+"\n"+"Su pago es de "+PagoHrsEmp+"$";
}

public static Empleado mayorEdad (Empleado emp1, Empleado emp2) {
	return (emp1.EdadEmp>= emp2.EdadEmp)? emp1:emp2;
	
}
	
public static Empleado mayorHrsTrabajadas (Empleado emp1, Empleado emp2) {
	return (emp1.HrsTrabEmp>= emp2.HrsTrabEmp)? emp1:emp2;
	
}	




}
