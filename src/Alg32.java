import java.util.Scanner;
public class Alg32 {

    public static void main(String [] args){
        // Ler um número inteiro e imprimi-lo. 
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o número inteiro");
        int inteiro = scanner.nextInt();
        System.out.println("Seu número inteiro: " + inteiro);
        scanner.close();
    }
}
