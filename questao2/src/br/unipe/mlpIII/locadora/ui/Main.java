package br.unipe.mlpIII.locadora.ui;

import br.unipe.mlpIII.locadora.modelo.Autor;
import br.unipe.mlpIII.locadora.modelo.Categoria;
import br.unipe.mlpIII.locadora.modelo.Fita;
import br.unipe.mlpIII.locadora.modelo.FitaInfantil;
import br.unipe.mlpIII.locadora.modelo.FitaLançamento;

public class Main {

	public static void main(String[] args) {
		Autor autor1=new Autor("Alisson");
		Fita fita1=new FitaLançamento("Vingadores",10.0,Categoria.Acao,autor1);
		
                Autor autor2 = new Autor("Jefferson") ;
                Fita fita2 = new FitaInfantil("Galinha pintadinha",5.0,Categoria.Animacao,autor2) ;
		
                fita1.calcularLocacao();
		fita2.calcularLocacao();
		System.out.println(fita1);
                System.out.println(fita2);

	}

}