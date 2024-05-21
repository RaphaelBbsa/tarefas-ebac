package Módulos.mod12.Arrays;

public class ExemplosArray {
    public static void main (String args []) {
        declacaraoArray();
        arrayBidimensional();
        int [][] meuArray = {{1, 2, 4}, {5, 6, 7}};
        tamanhoArray(meuArray);
        percorrendoArray();
        percorrendoArray2();
    }

    private static void percorrendoArray2() {
        System.out.println("*** Outro exemplo percorrendo array ***");
        int soma = 0;
        int [] arrayPPercorrer = {10,20,30,40};
        for(int i = 0; i < arrayPPercorrer.length; i++){
            soma += arrayPPercorrer[i];
    }
        System.out.println(soma);
    }

    private static void percorrendoArray() {
        System.out.println("*** Percorrendo o array ***");
        int total = 0;
        int [] arrayPPercorrer = {1,2,3,4,5,6,7,8,9};
        for(int i: arrayPPercorrer){
            total+= i;
        }
        System.out.printf("O total dos elementos desse array da = " + total);
    }

    private static void tamanhoArray(int [][] meuArray) {
        if(meuArray.length < 3) {
            System.out.printf("o número de colunas do meuArray é menor que 3, é 2!");
        }

    }

    private static void arrayBidimensional() {
        System.out.println("**** Array Bidimensional ****");
        int [][] array1 = { {100, 200, 300},{400, 500, 600} }; //no bidimensional, cada grupo de colchete representa a linha
        int [][] array2 = { {1, 2, 3},{4, 5, 6} };
        printArray(array1);
        //iterar = fazer novamente. Preciso lembrar que em arrays, eu não posso sobrescrever o método toString, logo eu tenho que iterar os elementos do array e fazer a saída manualmente
    }

    private static void printArray(int[][] array1) {
        for(int i = 0; i < array1.length; i++){ //array1.length nos dá o número de linhas na tabela.
            for(int j = 0; j < array1[i].length; j++){ //array1[i].length nos dá o número de colunas na linha i
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void declacaraoArray() {
        System.out.println("*** Declarando Array ***");
        int[]a = new int [10]; //aqui eu declaro o tamanho do array
        int [] b;
        b = new int[10]; //aqui está outra forma de declarar o tamanho da array
        int [] r = new int [10], r2 = new int [15]; //outra forma de declrar também
        int [] iniciaJaComValor = {12, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        r [0] = 120; // inicio o primeiro elemento
        r [1] = 10;
    }
}
