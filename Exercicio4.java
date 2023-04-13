package ExerciciosVariaveiseoperadores;

import java.util.Scanner;

public class Exercicio4 {
	

	public static void main(String[] args) {
		
		float n1,n2,n3,n4, diferenca1,diferenca2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		diferenca1 = (n1*n2)-(n3*n4);
		diferenca2 = (n1*n2)+(n3*n4);
		
		System.out.println("Diferença 1: "+diferenca1);
		System.out.println("Diferença 2: "+diferenca2);
		
		
		
	}

}
