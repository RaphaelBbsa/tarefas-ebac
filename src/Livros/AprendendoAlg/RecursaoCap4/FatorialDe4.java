package Livros.AprendendoAlg.RecursaoCap4;

public class FatorialDe4 {
    public static void main(String args[]){
        int numero = 4;
        int resultado = calculador(numero);

        System.out.println("O fatorial de " + numero + " é " + resultado);

    }

    private static int calculador(int n) {
            if(n==0){
                return 1;
            } else{
                return n* calculador(n -1); //chamada recursiva, faz o loop até parar no 1
            }
    }
}
