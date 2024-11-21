package Livros.AprendendoAlg.Quicksort;
-
public class Quicksort {

        public static void quickSort(int[] brinquedos, int inicio, int fim) {
            if (inicio < fim) {
                int indiceDoChefe = dividir(brinquedos, inicio, fim);
                quickSort(brinquedos, inicio, indiceDoChefe - 1);
                quickSort(brinquedos, indiceDoChefe + 1, fim);
            }
        }

        public static int dividir(int[] brinquedos, int inicio, int fim) {
            int chefe = brinquedos[inicio]; // Escolhemos o primeiro brinquedo como o chefe
            int i = inicio + 1;
            int j = fim;

            while (i <= j) {
                while (i <= fim && brinquedos[i] <= chefe) {
                    i++;
                }
                while (j >= inicio && brinquedos[j] > chefe) {
                    j--;
                }
                if (i < j) {
                    trocar(brinquedos, i, j);
                }
            }
            trocar(brinquedos, inicio, j); // Colocamos o chefe na posição correta
            return j; // Devolvemos o índice onde o chefe ficou
        }

        public static void trocar(int[] brinquedos, int i, int j) {
            int temp = brinquedos[i];
            brinquedos[i] = brinquedos[j];
            brinquedos[j] = temp;
        }

        public static void main(String[] args) {

            int[] brinquedos = {9, 2, 7, 3, 8, 5};
            quickSort(brinquedos, 0, brinquedos.length - 1);

            System.out.println("Brinquedos organizados:");
            for (int brinquedo : brinquedos) {
                System.out.print(brinquedo + " ");
            }
        }
    }


