package br.unipe.mlpIII.data.ui;

import java.util.Scanner;

import br.unipe.mlpIII.data.modelo.Data;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dia: ");
		String dia = scan.nextLine();
		System.out.print("Mês: ");
		String mes = scan.nextLine();
		System.out.print("Ano: ");
		String ano = scan.nextLine();		
		System.out.println(new Data(dia, mes, ano).toString());		
		scan.close();
	}
}