package ExerciciosVariaveiseoperadores;

import java.util.Scanner;

public class Exercicio1 {
	
		public static void main(String[] args) {

		float salario,abono = 0,novosalario =0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novosalario = (salario+abono);
		
		System.out.println("\nO Novo salário é: "+novosalario);
		
		
				}
		
		}
