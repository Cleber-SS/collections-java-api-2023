import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        
        try {
            
            Scanner scanner = new Scanner(System.in); 
            
            System.out.println("*** BANCO JAVA ***");
            System.out.println("Por favor, digite o seu primeiro nome: ");
            String nome = scanner.next();
            System.out.println(String.format("Oi, %s!\nDigite o numero abaixo do que deseja: ", nome));
            System.out.println("1. Depositar\n2. Sacar\n3. Consultar Saldo\n4. Encerrar");

            double saldo = 0;
        
            while (true) { 
                int opcao = scanner.nextInt();

                switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para deposito: ");
                    double depositar = scanner.nextDouble();
                    saldo += depositar;
                    System.out.println(String.format("Deposito de R$:%.2f realizado com sucesso.", depositar));
                    System.out.println("\nDigite a proxima operacao:\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n4. Encerrar");
                    break;

                case 2:
                    System.out.println("Digite o valor para sacar: ");
                    double sacar = scanner.nextDouble();
                    if(saldo < sacar) {
                        System.out.println("Operacao invalida!\nO valor do saque e maior que o saldo disponivel.");
                    }else if(saldo > 0 && saldo > sacar) {
                        saldo -= sacar;
                        System.out.println(String.format("Saque de R$:%.2f realizado com sucesso.", sacar));
                        System.out.println(String.format("Saldo atual R$:%.2f",saldo));  
                    }
                    System.out.println("\nDigite a proxima operacao:\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n4. Encerrar");
                    break;
                    
                case 3:
                    System.out.println(String.format("Saldo atual R$:%.2f",saldo));
                    System.out.println("\nDigite a proxima operacao:\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n4. Encerrar");
                    break;

                case 4:
                    System.out.println("Saindo da conta...");
                    System.out.println(String.format("Obrigado, %s!\nO BANCO JAVA agradece a preferencia!", nome));
                    System.out.println("Usuario saiu da conta.");
                    scanner.close();
                    break;
                        
                default:
                    System.out.println("Opcao inválida. Tente novamente.");
                    System.out.println("\nDigite a proxima operacao:\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n4. Encerrar");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println();
        } 
    }   
}
