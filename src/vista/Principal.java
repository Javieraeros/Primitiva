package vista;

import modelo.*;
import java.util.Vector;
import controladora.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Boleto> boletos=new Vector<>();
		Controller lista=new Controller();
		boletos=lista.listaBoletos();
		System.out.println("IdSorteo \tIdBoleto \tReintegro \tTipoApuesta \tPremio");
		for(int i=0;i<boletos.size();i++){
			System.out.print(boletos.elementAt(i).getIdSorteo());
			System.out.print("\t"+boletos.elementAt(i).getIdBoleto());
			System.out.print("\t"+boletos.elementAt(i).getReintegro());
			System.out.print("\t"+boletos.elementAt(i).getTipoApuesta());
			System.out.print("\t"+boletos.elementAt(i).getPremio());
			System.out.println();
		}
	}

}
