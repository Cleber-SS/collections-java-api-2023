import java.util.Locale;
import java.util.Scanner;

public class ContaTerminl {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo(a) ao Banco JAVA!");

        System.out.println("Por favor, digite o seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Qual valor deseja depositar em sua conta? ");
        Double saldo = scanner.nextDouble();
        
        System.out.println("Ola, " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("A sua agencia: " + agencia + " de conta: " + numero + ", o seu saldo R$:" + saldo + " ja esta disponivel para saque.");
        
        System.out.println("Ate mais!");
        
        scanner.close();
    }
}
