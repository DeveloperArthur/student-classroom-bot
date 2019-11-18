package br.com.scb;
import java.util.Scanner;

import br.com.scb.dominio.Aluno;
import br.com.scb.servico.AlunoServicoImpl;

public class Main {
	public static void main (String arg []){
		System.out.println("Bem vindo! Digite seu nome com a inicial maiuscula!");
		
		Aluno aluno = new Aluno(new Scanner(System.in).nextLine());
		AlunoServicoImpl servico = new AlunoServicoImpl();
		
		String sala = servico.mostrarSala(aluno.getNome());
		System.out.println(aluno.getNome()+" sua sala é a "+sala);
	}
}
