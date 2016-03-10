package br.unipe.mlpIII.questao2.ui;

import br.unipe.mlpIII.questao2.modelo.Pessoa;
import br.unipe.mlpIII.questao2.modelo.Veiculo;
import br.unipe.mlpIII.questao2.modelo.VeiculoDeCarga;

public class Main {
   public static void main(String[] args) {
       
		VeiculoDeCarga v1 = new VeiculoDeCarga("JKM-3344", "MercedesBenzo", "2015", 2014, 50.50, 5000, 5520, 1000000);
		VeiculoDePasseio v2 = new VeiculoDePasseio("JPL-1122", "Volvó", "2012", 2012, 10.00, 20000, 22000, true, 4);
       
   } 


                System.out.println("Andei do KM " + v1.getKmInicial() + " até o KM " + v1.getKmFinal() + " deu quanto?");
		System.out.println("A gente ta cobrando R$ " + v1.getValorKmRodado() + " pra você sair nessa " + v1.getMarca() + " que suporta " + v1.getCapacidadeDeCarga() + " Kg" + ", então vai custar R$ " + v1.calcularLocacao());
		System.out.println("Andei do KM " + v2.getKmInicial() + " até o KM " + v2.getKmFinal() + " deu quanto?");
		System.out.println("A gente ta cobrando " + v2.getValorKmRodado() + " pra você sair nessa " + v2.getMarca() + ", então vai custar R$ " + v2.calcularLocacao());


}