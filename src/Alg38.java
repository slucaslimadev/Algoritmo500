import java.util.Scanner;
public class Alg38 {
    public static void main(String[] args){
        // Ler um numero real e imprimir a terça parte deste numero 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número real");
        Double real = scanner.nextDouble();
        Double terco = real / 3;
        System.out.println("Número interio: " + real + "\nTerço do número: "+terco);
        scanner.close();
}
}
