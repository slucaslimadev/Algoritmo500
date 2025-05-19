import java.util.Scanner;
public class Alg39 {
public static void main(String [] args){
    // Entrar com dois numeros reais e imprimir a media aritmética com a mensagem media antes do resultado
    Scanner  scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro númerO real");
    Double n1 = scanner.nextDouble();
    System.out.println("Digite o segundo númerO real");
    Double n2 = scanner.nextDouble();
    Double media = (n1 + n2) / 2;
    System.out.println("Media: " + media);
    scanner.close();

}
}
