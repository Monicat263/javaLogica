/*
   Eu como usáruos gostaria de um sistema que fizesse automaticamente
   a tabuada de 1 até 10
 */

package academy.java.lacofor;

public class TabuadaGeral01 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for (int j= 1 ; j <= 10; j++){
                int tabuada = i * j;
                System.out.println( i +" X " + j + " = "+ tabuada);
            }
            System.out.println("*************");
        }
    }
}
