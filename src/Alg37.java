import java.util.Scanner;
public class Alg37 {
    public static void main(String[] args){
        // Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Produto. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int prod = n1 * n2;
        System.out.println("Numero 1: " + n1 + "\nNumero 2: "+ n2 +"\nSoma: "+prod);
        scanner.close();

    }
}
