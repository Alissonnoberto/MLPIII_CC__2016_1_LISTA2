package br.unipe.mlpIII.locadora.modelo;
public class FitaInfantil extends Fita{

    public FitaInfantil(String titulo, double price, Categoria categoria, Autor autor) {
        super(titulo, price, categoria, autor);
    }
public void calcularLocacao() {
		price-=(0.40*price);
	}
}