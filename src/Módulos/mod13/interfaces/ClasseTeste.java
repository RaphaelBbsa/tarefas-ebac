package Módulos.mod13.interfaces;

/**
 * Criar interfaces em Java ajuda a garantir que diferentes tipos de objetos (como carrinhos, bonecas e aviões)
 * possam fazer as mesmas coisas de maneiras específicas para cada um. É como um plano que todos eles seguem, permitindo que você trabalhe com eles de forma consistente e organizada.
 */

public class ClasseTeste {
    public static void main(String args []){
        ICaneta caneta = new Caneta1();
        caneta.escrever("Olá Rapha");
        System.out.println(caneta.getCor());
        caneta.escreverComumATodas();

    }
}
