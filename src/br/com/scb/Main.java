/*A turma de programação I, por ter muitos alunos, será dividida em dias de provas. 
Decidiu-se dividi-las em 3 grupos. 
Faça um programa que leia o nome do aluno e imprima a sala onde o mesmo irá fazer a prova:
A – K: sala 101
L – N: sala 102
O – Z: sala 103*/
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
