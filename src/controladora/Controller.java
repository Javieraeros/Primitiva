package controladora;

import java.util.Vector;

import modelo.Boleto;
import capaDAL.*;

public class Controller {


	public Vector<Boleto> listaBoletos(){
		Listados listaDAL=new Listados();
		return listaDAL.listaBoletos(); 
	}
}
