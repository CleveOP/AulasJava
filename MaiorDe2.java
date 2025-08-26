/*Ler dois números e mostrar o maior  */

import java.util.Scanner;

public class MaiorDe2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número : ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo número : ");
        double valor2 = scanner.nextDouble();
        if(valor1 >=valor2){
            System.out.print("O maior valor é " + valor1);
        }
        else{
            System.out.print("O maior valor é " + valor2);
        }

        scanner.close();
        }
    }

