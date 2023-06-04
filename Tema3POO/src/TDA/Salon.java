package TDA;

public class Salon {

	private double Altura;
	private double Base;
	
public Salon(double Altura,double Base) {
	
	this.Altura=Altura;
	this.Base=Base;
}

public double getAltura() {
	return Altura;
}

public void setAltura(float altura) {
	Altura = altura;
}

public double getBase() {
	return Base;
}

public void setBase(float base) {
	Base = base;
}

public double Perimetro () {
	
	return 2*(Altura+Base);
	
	
}

public double Area() {
	
	return Altura*Base;
	
	
}

}
