package br.com.scb.servico;
public class AlunoServicoImpl implements AlunoServico{

	@Override
	public String mostrarSala(String nome) {
		String sala = "";
		char letra = nome.charAt(0);
		switch(letra) {
			case 'A':
				sala = "sala 101";
				break;
			case 'B':
				sala = "sala 101";
				break;
			case 'C':
				sala = "sala 101";
				break;
			case 'D':
				sala = "sala 101";
				break;
			case 'E':
				sala = "sala 101";
				break;
			case 'F':
				sala = "sala 101";
				break;
			case 'G':
				sala = "sala 101";
				break;
			case 'H':
				sala = "sala 101";
				break;
			case 'I':
				sala = "sala 101";
				break;
			case 'J':
				sala = "sala 101";
				break;
			case 'K':
				sala = "sala 101";
				break;
			case 'L':
				sala = "sala 102";
				break;
			case 'M':
				sala = "sala 102";
				break;
			case 'N':
				sala = "sala 102";
				break;
			case 'O':
				sala = "sala 103";
				break;
			case 'P':
				sala = "sala 103";
				break;
			case 'Q':
				sala = "sala 103";
				break;
			case 'R':
				sala = "sala 103";
				break;
			case 'S':
				sala = "sala 103";
				break;
			case 'T':
				sala = "sala 103";
				break;
			case 'U':
				sala = "sala 103";
				break;
			case 'V':
				sala = "sala 103";
				break;
			case 'W':
				sala = "sala 103";
				break;
			case 'X':
				sala = "sala 103";
				break;
			case 'Y':
				sala = "sala 103";
				break;
			case 'Z':
				sala = "sala 103";
				break;
			default:
				throw new IllegalArgumentException("Digite a inicial do nome com maiusculo!");
		}
		return sala;
	}
}
