package tarefas_modulos.mod12;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String sexo;

    public Pessoa(String nome){
        this.nome=nome;
    }

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override // Primeira Comparação: Ana e Carlos, Ana.compareTo(Carlos), this.nome é "Ana" e o.nome é "Carlos".
    public int compareTo(Pessoa o) { //Lexicograficamente, "A" vem antes de "C", então "Ana" é menor que "Carlos".
        return this.nome.compareTo(o.nome); //O método compareTo de String retornará um valor negativo. Faz a comparação com todos os valores da lista
    }
}
//código que exemplifica como o compareTo funciona

/**
 * public int compareTo(String anotherString) {
 *     int len1 = value.length;
 *     int len2 = anotherString.value.length;
 *     int lim = Math.min(len1, len2);
 *     char v1[] = value;
 *     char v2[] = anotherString.value;
 *
 *     int k = 0;
 *     while (k < lim) {
 *         char c1 = v1[k];
 *         char c2 = v2[k];
 *         if (c1 != c2) {
 *             return c1 - c2;
 *         }
 *         k++;
 *     }
 *     return len1 - len2;
 * }
 *
 */

