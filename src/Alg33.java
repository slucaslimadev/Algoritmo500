import java.util.Scanner;

public class Alg33 {
    public static void main(String[] args){
        // Ler dois números inteiros e imprimi-los. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int int1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int int2 = scanner.nextInt();
        System.out.println("Inteiro 1: " + int1 + "\nInteiro 2: " + int2);
        scanner.close();

    }

}
