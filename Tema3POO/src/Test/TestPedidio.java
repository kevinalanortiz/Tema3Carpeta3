package Test;

import EntradaSalidas.Tools;
import TDA.RestPedido;

public class TestPedidio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CapturaPedidos();
		
	}

	
	public static void CapturaPedidos() {

		RestPedido P1=new RestPedido();
				
		P1.setPrimerPlat(Tools.PrimerPlato());
		P1.setBebida(Tools.Bebida());
		if (Tools.AgregarPlato2()==0) {
		P1.setSegundoPlat(Tools.SegundoPlato());
		if (Tools.AgregarPostre()==0) {
			P1.setPostre(Tools.Postre());
			Tools.Salida("Su precio es "+P1.CostoPedido2(P1)+"$");
			}else Tools.Salida("Su precio es "+P1.CostoPedido1(P1)+"$");
		}else Tools.Salida("Su precio es "+P1.CostoPedido(P1)+"$");
		
		
	}
	
}
/*
RestPedido P1=new RestPedido();
		P1.setPrimerPlat(Tools.leerString("¿Que plato desea pedir?\n1.Crema de Espinacas\n2.Ensalada de Verduras\n3.Crema de Brócoli"
				+"\n4.Caldo Tlalpeño\n5.Sopa Mixteca"));
		P1.setBebida(Tools.leerString("¿Que bebida le gustaria tomar?\n1.Coca cola\n2.Pepsi\n3.Naranjada\n4.Limonada\n5.Agua de sabor"));
		JOptionPane.showConfirmDialog(null, P1)
		res=Tools.seguirSino();*/