
package br.unipe.mlpIII.questao2.modelo;

public class Veiculo {
        private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKmRodado;
	private double kmInicial;
	private double kmFinal;
	private double valorLocacao;
        private  String chassi;
        private Pessoa proprietario;
        
     public Veiculo(String placa, String marca, String modelo, int ano,
			double valorKmRodado, double kmInicial, double kmFinal,String chassi,Pessoa proprietario) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
                this.chassi = chassi;
                this.proprietario = proprietario;
	}   
      public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
        public String getChassi() {
			return chassi;
		}

		public void setChassi(String chassi) {
			this.chassi = chassi;
		}
       public Pessoa getProprietário() {
			return proprietario;
		}

		public void setProprietário(Pessoa proprietario) {
			this.proprietario = proprietario;
		}         
public double calcularLocacao(){
		valorLocacao = (kmFinal - kmInicial)*valorKmRodado; 
		return valorLocacao;
	}



}

