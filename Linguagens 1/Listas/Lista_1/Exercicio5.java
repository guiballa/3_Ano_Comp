import java.util.Scanner;

public class Exercicio5{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int f1 = 0; 
        int f2 = 1; 
        int f3;
        int i;
        //Entrada de dados
        System.out.println("Digite o numero desejado da sequencia: ");
        num = scanner.nextInt();

        //Fibonacci
            for(i = 1; i < num; i++){
                f3 = f2 + f1;
                f1 = f2;
                f2 = f3;
            }
            System.out.println(" " + f2);
     }
    }