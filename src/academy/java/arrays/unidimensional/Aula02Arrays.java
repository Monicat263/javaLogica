/*
    Armazene em dois vitores v1 e v2 9 valores númeriso inteiros e exibir o resultado da multiplicação
    dos números do v1 com os correspondentes em v2.

 */
package academy.java.arrays;

public class Aula02Arrays {
    public static void main(String[] args) {
        int v1[] = {1,2,3,4,5,6,7,8,9};
        int v2[] = {2,3,4,5,6,7,8,9,10};

        int calculo [] = new int[v1.length];

        // Multiplicação elemento a elemento
        for (int i = 0; i <v1.length; i++) {
            calculo[i]= v1[i] * v2[i];
        }
        // Exibindo o resultado
        for (int i = 0; i <calculo.length; i++) {
            System.out.println("calculo[" + i + "] = " + calculo[i]);
        }
    }
}
