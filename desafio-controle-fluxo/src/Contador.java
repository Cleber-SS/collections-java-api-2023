import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo valor: ");
        int parametroDois = terminal.nextInt();    

        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo valor deve ser MAIOR que o primeiro.");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int conta = 1; conta <= contagem; conta ++) {
            System.out.println("Impirmindo o numero " + conta);
        }
        System.out.println("Impressao realizada com sucesso!");
    }    
}
