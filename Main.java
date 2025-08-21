import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//========================================================
		
		/**
		  1) Fazer um programa para ler um número inteiro, 
		  e depois dizer se este número é negativo ou não.
		 */
		
		/*
		 	int nr;
		 
			 System.out.println("Digite um numero (int)");
			 
			 nr = sc.nextInt();
			 
			 if(nr < 0) {
				 System.out.println("Negativo");
			 }
			 else {
				 System.out.println("Não Negativo");
			 }
		*/ 
		
		//========================================================

		/**
		 2) Fazer um programa para ler um número inteiro e dizer 
		 se este número é par ou ímpar.
		 */
		
		/*
			int nr;
			 
			 System.out.println("Digite um numero (int)");
			 
			 nr = sc.nextInt();
			 
			 if((nr % 2) == 0) {
				 System.out.println("Par");
			 }
			 else {
				 System.out.println("Impar");
			 }
		 */
		
		//========================================================
		
		/**
		 3) Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
		 mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
		 lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
		 em ordem crescente ou decrescente.
		 */

		/*
			int A,B;
			 
			 System.out.println("Digite dois numeros (int)");
			 
			 A = sc.nextInt();
			 B = sc.nextInt();
			 
			 if(A == 0 || B == 0) {
				 System.out.println("Divisão por zero!");
			 }
			 else {
				 if(A % B == 0 || B % A == 0) {
					 System.out.println("Sao Multiplos");
				 }
				 else {
					 System.out.println("Nao sao Multiplos");
				 }
			 }
		 */
		 
		//========================================================
		
		/**
		 4) Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
		 do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
		 tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		/*
			int ini,fim,tempo;
			
			System.out.println("Digite hora de inicio e fim (int)");
			 
			ini = sc.nextInt();
			fim = sc.nextInt();
			
			if(ini == fim) {
				tempo = 24;
			}
			else if(ini < fim){
				tempo = fim - ini;
			}
			else {
				// ini > fim
				tempo = 24 - ini + fim;
			}
			
			System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		*/
		
		//========================================================
		
		/**
		 5) Com base na tabela abaixo, escreva um programa que leia o código
		 de um item e a quantidade deste item. A seguir, calcule e mostre o 
		 valor da conta a pagar.
		 */
		
		/*
			int cod;
			float qtd,total;
			boolean erro; 
			
			erro = false;
			total = 0;
			System.out.println("Digite o código do item (int) e quantidade (float)");
			
			cod = sc.nextInt();
			qtd = sc.nextFloat();
			
			if(cod == 1) {
				total = (float) (qtd * 4.0);
			}
			else if(cod == 2) {
				total = (float) (qtd * 4.5);
			}
			else if(cod == 3) {
				total = (float) (qtd * 5.0);
			}
			else if(cod == 4) {
				total = (float) (qtd * 2.0);
			}
			else if(cod == 5) {
				total = (float) (qtd * 1.5);
			}
			else {
				erro = true;
			}
			
			if(erro) {
				System.out.println("Item não cadastrado!");
			}
			else {
				System.out.printf("Total = %.2f",total);
			}
		*/
		
		//========================================================
		
		/**
		 6) Você deve fazer um programa que leia um valor qualquer e apresente 
		 uma mensagem dizendo em qual dos seguintes intervalos 
		 ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		 Obviamente se o valor não estiver em nenhum destes intervalos, 
		 deverá ser impressa a mensagem “Fora de intervalo”.
		 */
		
		/*
			float x;
			String intervalo;
			boolean erro;
			
			intervalo = "";
			erro = false;
			x = 0;
			
			System.out.println("Digite o intervalo (float)");
			
			x = sc.nextFloat();
			
			if(x >= 0 && x <= 25) {
				intervalo = "[0,25]";
			}
			else if(x > 25 && x <= 50) {
				intervalo = "(25,50]";
			}
			else if(x > 50 && x <= 75) {
				intervalo = "(50,75]";
			}
			else if(x > 75 && x <= 100) {
				intervalo = "(75,100]";
			}
			else if(x > 75 && x <= 100) {
				intervalo = "(75,100]";
			}
			else{
				erro = true;
			}
			
			if(erro) {
				System.out.println("Fora de intervalo");
			}
			else {
				System.out.println("Intervalo "+intervalo);
			}
		*/
		
		//========================================================
		
		/**
		 7) Leia 2 valores com uma casa decimal (x e y), que devem representar
		 as coordenadas de um ponto em um plano. A seguir, determine qual o 
		 quadrante ao qual pertence o ponto, ou se está sobre um dos eixos 
		 cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, 
		 escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos 
		 escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
		 */
		
		/*
			System.out.println("Digite dois pontos de coordenadas (float)");
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if (x == 0.0 && y == 0.0) {
				System.out.println("Origem");
			}
			else if (x == 0.0) {
				System.out.println("Eixo Y");
			}
			else if (y == 0.0) {
				System.out.println("Eixo X");
			}
			else if (x > 0.0 && y > 0.0) {
				System.out.println("Q1");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("Q2");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
		*/
		
		//========================================================
		
		/**
		 8)Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. 
		 Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de
		 Renda, segundo a tabela abaixo. Lembre que, se o salário for R$ 3002.00, a taxa 
		 que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de
		 R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo),
		 a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 
		 no total. O valor deve ser impresso com duas casas decimais.
		 */
		
		double salario,imposto;

		System.out.println("Digite o salario (float)");
		
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
	
		sc.close();
	}

}
