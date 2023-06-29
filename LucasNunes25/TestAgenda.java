package com.Estudo.LucasNunes25;

import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Digite aqui o nome do contato");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda();
		agenda.setNome(nome);
		
		Contato [] contatos = new Contato[3];
		
		for(int i=0; i<3; i++ ) {
			System.out.println("Entre com as informações do contato" + (i+1));
			Contato c = new Contato();
			
			System.out.println("Entre com o nome");
			nome = scan.nextLine();
			
			System.out.println("Entre com o Telefone");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			
			System.out.println("Entre com o Email.");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] =  c;
				
		}
		
		agenda.setContato(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
		
		
	}

}
