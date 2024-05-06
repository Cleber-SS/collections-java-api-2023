public class ResultadoEscolar {
    public static void main(String[] args) {
        
        //-> Opção 1: condição if/else:
        //int nota = 8;
        //if(nota >=7)
        //    System.out.println("Aprovado!");
        
        //else if(nota >=5 && nota <7)
        //    System.out.println("Recuperação!");

        //else
        // System.out.println("Reprovado!");

        //------------------------------------------------------------------

        //-> Opção 2: condição ternária simples:
        //int nota = 7;
        //String resultado = nota >=7 ? "Aprovado!" : "Reprovado!";
        //System.out.println(resultado);

        //--------------------------------------------------------------------

        //-> Opção 3: condição ternária composta:
        int nota = 6;
		String resultado = nota >=7 ? "Aprovado!" : nota >=5 && nota <7 ? "Recuperação!" : "Reprovado!";
		System.out.println(resultado);
    }
}
