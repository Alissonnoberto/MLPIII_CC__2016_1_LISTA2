
package br.unipe.mlpIII.questao2.modelo;

public class VeiculoDePasseio extends Veiculo{
    private boolean arcondicionado;
    private int quantidadeDePortas;
	
	public VeiculoDePasseio(String placa, String marca, String modelo, int ano,
			double valorKmRodado, double kmInicial, double kmFinal, boolean arcondicionado, int quantidadeDePortas,String chassi, Pessoa proprietario) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal,chassi, proprietario);
		this.arcondicionado = arcondicionado;
		this.quantidadeDePortas = quantidadeDePortas;
	}

	public boolean isArcondicionado() {
		return arcondicionado;
	}

	public void setArcondicionado(boolean arcondicionado) {
		this.arcondicionado = arcondicionado;
	}

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
    
}
