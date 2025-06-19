package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

import br.com.senaisp.bauru.aula03.Exercicio01;

public class Exercio01 {

	public static void main(String[] args) {
		//Usando o scanner para ler um arquivo texto
		Scanner sc = new Scanner(Exercicio01.class.getResourceAsStream("arquivo.txt"));
		String linha = sc.nextLine(); //pegando cabeçalho
		Scanner sca = new Scanner(linha);
		sca.useDelimiter(";");
		//imprimindo o cabeçalho
		while(sca.hasNext()) {
			System.out.println(sca.next()+"\t\t");// \t = tab
		}
		System.out.println(); //pulando a linha
		sca.close(); //fechando o scanner de apoio
		while(sc.hasNextLine()) {
			linha = sc.nextLine();
			sca = new Scanner(linha);
			sca.useDelimiter(";");
			
		}
	}

}
