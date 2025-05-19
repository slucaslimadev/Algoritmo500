import java.util.Scanner;
public class Alg40 {
    public static void main(String[] args){
        // Entrar com dois numeros inteiros e imprimir a seguinte saída: dividendo, divisor, quociente, resto
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o divisor: ");
        int n2 = scanner.nextInt();
        int quoc = (n1 / n2);
        int resto = (n1 % n2);
        System.out.println("Dividendo: "+ n1 + "\nDivisor: " + n2 + "\nQuociente: "+ quoc + "\nResto: "+resto);
        scanner.close();
    

    }
}
