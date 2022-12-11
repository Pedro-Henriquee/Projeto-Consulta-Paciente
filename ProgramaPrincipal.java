package exercicios;

import java.util.*;

public class ProgramaPrincipal {
	
	static Consulta[] consultasArray = new Consulta[10]; 
	static int[] numeros = new int[10]; //Alterar caso altere o numero de consultas
	static Scanner s = new Scanner(System.in);
	static Scanner z = new Scanner(System.in);
	
	public static void marcarConsulta() {
		for (int i = 0; i < consultasArray.length; i++) {
			Consulta aConsulta = new Consulta();
			Paciente oPaciente = new Paciente();
			System.out.println("--------------------\nDados da consulta " + (i+1)+ ".\n---------------------");
			System.out.println("Digite o c�digo da consulta: ");
			aConsulta.setCodigoConsulta(s.nextInt());
			System.out.println("Digite a data da consulta: ");
			aConsulta.setData(z.nextLine());
			System.out.println("Digite o hor�rio da consulta: ");
			aConsulta.setHorario(z.nextLine());
			System.out.println("Digite o valor da consulta: ");
			aConsulta.setValor(s.nextDouble());
			aConsulta.setPaciente(oPaciente);
			
			consultasArray[i] = aConsulta;
		}
		
		System.out.println("CONSULTAS DISPON�VEIS: \n--------------------");
		for (int i = 0; i < consultasArray.length; i++) {
			System.out.println(consultasArray[i].toStringInicial()+ "\n--------------------\n");
		
		}
		for (int i = 0; i < consultasArray.length; i++) {
			Consulta aConsulta = new Consulta();
			Paciente oPaciente = new Paciente();
			boolean achou = false;
			int numero = -1;
			while (achou == false) {
				System.out.println("Digite o c�digo da consulta na qual se deseja comprar: ");
				numero = s.nextInt();
				for (int j = 0; j < consultasArray.length; j++) {
					if (numeros[j] == numero) {
						System.out.println("Consulta j� comprada! Digite outra: ");
						numero = s.nextInt();
						break;
					
					}
				}
				
				numeros[i] = numero;
				achou = true;
			}
			
			System.out.println("Digite o c�digo do paciente: ");
			oPaciente.setCodigo(s.nextInt());
			System.out.println("Digite o nome do paciente: ");
			oPaciente.setNome(z.nextLine());
			System.out.println("Digite o sexo do paciente: ");
			oPaciente.setSexo(z.nextLine());
			consultasArray[i].setPaciente(oPaciente);
			
		}
		
	}
	
	public static void mostrarConsultas() {
		System.out.println("--------------------\nDADOS FINAIS DE TODAS AS CONSULTAS MARCADAS\n--------------------\n"); 
		for (int j = 0; j < consultasArray.length; j++) {
			System.out.println(consultasArray[j].toStringFinal() + "\n--------------------\n");
		}
		
		
		
	}
	
	public static void mostrarValorTotalConsultas() {
		double valorTotal = 0;
		for (int i = 0; i < consultasArray.length; i++) {
			valorTotal += consultasArray[i].getValor();
		}
		System.out.println("--------------------\nValor total das consultas marcadas: " + valorTotal);
		
		
	}

	public static void main(String[] args) {
		marcarConsulta();
		mostrarConsultas();
		mostrarValorTotalConsultas();
		

	}

}
