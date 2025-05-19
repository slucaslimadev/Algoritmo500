import java.util.Scanner;
public class Alg34 {
    // Ler um número inteiro e imprimir seu sucessor e seu antecessor. 
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número: ");
    int n = scanner.nextInt();
    System.out.println("Número digitado: " + n + "\nSucessor: "+ (n + 1) + "\nAntecessor: "+(n - 1));
    scanner.close();
    }

}
