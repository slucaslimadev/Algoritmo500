import java.util.Scanner;
public class Alg35 {
    public static void main(String[] args){
        // Ler nome, endereço e telefone e imprimi-los. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Nome: "+ nome+ "\nEndereço: "+endereco+"\nTelefone: "+telefone);
        scanner.close();
    }
}
