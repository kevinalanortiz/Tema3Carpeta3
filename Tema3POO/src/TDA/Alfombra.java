package TDA;

public class Alfombra {

	private double Altura;
	private double Base;
	
public Alfombra(double Altura,double Base) {
	
	this.Altura=Altura;
	this.Base=Base;
}


public double getAltura() {
	return Altura;
}

public void setAltura(double altura) {
	Altura = altura;
}

public double getBase() {
	return Base;
}

public void setBase(double base) {
	Base = base;
}

public double Perimetro () {
	
	return  (2*(Altura+Base));
	
	
}

public double Area() {
	
	return (Altura*Base);
	
	
}

}
