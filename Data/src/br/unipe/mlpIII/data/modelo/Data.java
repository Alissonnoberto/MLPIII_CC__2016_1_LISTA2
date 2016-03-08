package br.unipe.mlpIII.data.modelo;

public class Data {
	private String mes;
	private String dia;
	private String ano;

	final String DataValidaçao = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";

	public Data() {

	}

	public Data(String dia, String mes, String ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}



	public String toString() {
		String data = String.format("%s/%s/%s", dia, mes, ano);
		if (data.matches(DataValidaçao)) {
			return data;
		}
		return ("Entrada inválida.");
	}
}
