package TDA;

public class RestPedido {

	private String PrimerPlat;
	private String SegundoPlat;
	private String Bebida;
	private String Postre;

	
public RestPedido() {}

	public RestPedido(String primerPlat, String segundoPlat, String bebida, String postre) {
	this.PrimerPlat = primerPlat;
	this.SegundoPlat = segundoPlat;
	this.Bebida = bebida;
	this.Postre = postre;
}

	public String getPrimerPlat() {
		return PrimerPlat;
	}

	public void setPrimerPlat(String primerPlat) {
		PrimerPlat = primerPlat;
	}

	public String getSegundoPlat() {
		return SegundoPlat;
	}

	public void setSegundoPlat(String segundoPlat) {
		SegundoPlat = segundoPlat;
	}

	public String getBebida() {
		return Bebida;
	}

	public void setBebida(String bebida) {
		Bebida = bebida;
	}

	public String getPostre() {
		return Postre;
	}

	public void setPostre(String postre) {
		Postre = postre;
	}

public short CostoPedido(RestPedido P1) {
	short CPlato1=0,CBebida=0;
	
	switch (P1.getPrimerPlat()) {
	case "Crema de espinacas":CPlato1=120;	break;
	case "Ensalada de verduras":CPlato1=150;	break;
	case "Crema de brócoli":CPlato1=125;	break;
	case "Caldo tlalpeño":CPlato1=100;	break;
	case "Sopa mixteca":CPlato1=160;	break;
	}
	
	switch (P1.getBebida()) {
	case "Coca cola":CBebida=30;	break;
	case "Pepsi":CBebida=30;	break;
	case "Naranjada":CBebida=25;	break;
	case "Limonada":CBebida=35;	break;
	case "Agua de sabor":CBebida=40;	break;
	}
	
	return (short) (CPlato1+CBebida);
}
public float CostoPedido1(RestPedido P1) {
		short CPlato1=0,CBebida=0,CPlato2=0;
		
		switch (P1.getPrimerPlat()) {
		case "Crema de espinacas":CPlato1=120;	break;
		case "Ensalada de verduras":CPlato1=150;	break;
		case "Crema de brócoli":CPlato1=125;	break;
		case "Caldo tlalpeño":CPlato1=100;	break;
		case "Sopa mixteca":CPlato1=160;	break;
		}
		
		switch (P1.getSegundoPlat()) {
		case "Filete de Pescado":CPlato2=190;	break;
		case "Milanesa de Pollo":CPlato2=135;	break;
		case "Bistec a la mexicana":CPlato2=110;	break;
		case "Pollo en escabeche":CPlato2=120;	break;
		case "Carne asada":CPlato2=100;	break;
		case "Lomo relleno":CPlato2=200;	break;
		case "Pollo a la plancha":CPlato2=150;	break;
		}
		

	switch (P1.getBebida()) {
	case "Coca cola":CBebida=30;	break;
	case "Pepsi":CBebida=30;	break;
	case "Naranjada":CBebida=25;	break;
	case "Limonada":CBebida=35;	break;
	case "Agua de sabor":CBebida=40;	break;
	}
	
	return CPlato1+CPlato2+CBebida;
}
		
public float CostoPedido2(RestPedido P1) {
	short CPlato1=0,CBebida=0,CPlato2=0,CPostre=0;
	
	switch (P1.getPrimerPlat()) {
	case "Crema de espinacas":CPlato1=120;	break;
	case "Ensalada de verduras":CPlato1=150;	break;
	case "Crema de brócoli":CPlato1=125;	break;
	case "Caldo tlalpeño":CPlato1=100;	break;
	case "Sopa mixteca":CPlato1=160;	break;
	}
	
	switch (P1.getSegundoPlat()) {
	case "Filete de Pescado":CPlato2=190;	break;
	case "Milanesa de Pollo":CPlato2=135;	break;
	case "Bistec a la mexicana":CPlato2=110;	break;
	case "Pollo en escabeche":CPlato2=120;	break;
	case "Carne asada":CPlato2=100;	break;
	case "Lomo relleno":CPlato2=200;	break;
	case "Pollo a la plancha":CPlato2=150;	break;
	}
	
switch (P1.getBebida()) {
case "Coca cola":CBebida=30;	break;
case "Pepsi":CBebida=30;	break;
case "Naranjada":CBebida=25;	break;
case "Limonada":CBebida=35;	break;
case "Agua de sabor":CBebida=40;	break;
}


switch (P1.getPostre()) {
case "Pastel helado":CPostre=120;	break;
case "Helado":CPostre=90;	break;
case "Fresas con crema":CPostre=100;	break;
case "Plátanos fritos":CPostre=70;	break;
case "Flan casero":CPostre=85;	break;
case "Gelatina":CPostre=50;  break;
}

return CPlato1+CPlato2+CBebida+CPostre;
}


	
}
