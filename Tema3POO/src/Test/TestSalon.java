package Test;
import TDA.Salon;
import EntradaSalidas.Tools;
import TDA.Alfombra;
public class TestSalon {

	public static void main(String[] args) {
	
		DatosSalon();
	}	
	public static void DatosSalon() {	
	Salon Sal=new Salon((int) 7, (double)6.5);	
	Alfombra Alf1=new Alfombra((double)3.8,(double)4.5);
	Alfombra Alf2=new Alfombra((double)4.5,(double)2.3);

	double AreaAlf = (Alf1.Area()+Alf2.Area());
	double AreaSal=Sal.Area()-AreaAlf;
	Tools.Salida("El area total del salon es de: "+Sal.Area()+" m\n"+"El area de la Alfombra 1 es de: "+(float)Alf1.Area()+" m\n"+
			"El area de la Alfombra 2 es de: "+(float)Alf2.Area()+" m\n"+
			"El area que ocupa las alfombras son de "+(float)AreaAlf+" m\n"+"El area que no esta ocuapada es de "+(float)AreaSal+" m");
	
	}
}
