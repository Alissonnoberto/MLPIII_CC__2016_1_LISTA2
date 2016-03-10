package br.unipe.mlpIII.questao2.modelo;

public class VeiculoDeCarga extends Veiculo {
    	
	protected double capacidadeDeCarga;

	public VeiculoDeCarga(String placa, String marca, String modelo, int ano,
			double valorKmRodado, double kmInicial, double kmFinal,String chassi, Pessoa proprietario, double capacidadeDeCarga) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal,chassi, proprietario);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
    
}
