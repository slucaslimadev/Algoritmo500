import java.util.Scanner;
public class Alg41 {
    public static void main(String[] args){
        // Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os quatros numeros: ");
        Double n1 = scanner.nextDouble();
        Double n2 = scanner.nextDouble();
        Double n3 = scanner.nextDouble();
        Double n4 = scanner.nextDouble();
        System.out.println("Media ponderada: "+ ((n1 * 1 + n2 * 2 + n3 * 3 + n4 * 4)/ 10));
        scanner.close();

    }
}
