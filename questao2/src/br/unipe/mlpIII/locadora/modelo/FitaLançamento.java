
package br.unipe.mlpIII.locadora.modelo;
public class FitaLançamento extends Fita{
	
    public FitaLançamento(String titulo, double price, Categoria categoria, Autor autor) {
        super(titulo, price, categoria, autor);
    }
public void calcularLocacao() {
		price+=(0.20*price);
}
}