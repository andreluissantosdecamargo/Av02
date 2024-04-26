package condicional;

import java.util.Scanner;

public class ExDezessete {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float sal_carlos, sal_joao;
        int meses;
        
        sal_carlos = 0;
        meses = 0;
  
        while (sal_carlos <= 0) {
            System.out.print("Digite o salário de Carlos: ");
            sal_carlos = sc.nextFloat();
            
            if (sal_carlos <= 0) {
                System.out.println("\nO valor para o salário é inválido!\n");
            }
        }
        
        sal_joao = sal_carlos / 3;
        
        while (sal_joao < sal_carlos) {
            meses++;
            sal_carlos = sal_carlos + (sal_carlos * 2 / 100);
            sal_joao = sal_joao + (sal_joao * 5 / 100);
        }
        
        System.out.println("\nQuantidade de meses necessários para que o salário de João seja igual ou maior que o de Carlos: " + meses);
        System.out.println("Valor que Carlos pertence: R$" + sal_carlos);
        System.out.println("Valor que João pertence: R$" + sal_joao);
        
        sc.close();
	    }
	}
