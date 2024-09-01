package academy.java.estruturascondicionais.ifselse;/*
  -- Se o salário for maior que 4500 impimia 30%
       -- senão imrpima 15% idade
 */

public class ControleIfandElse03 {
    public static void main(String[] args) {
        float sal = 4500.00F;
        double resulatdo;

        if (sal > 4500.00) {
            resulatdo = sal * 0.30;

        } else {
            resulatdo = sal * 0.15;
        }
        System.out.println("O valor do salários é R$ : " + sal + " e o desconto será de  R$  " + String.format("%.2f",resulatdo));


        // com operador ternário

        double salTernario = 5000.00;
        // usando operador ternário

        double resultado = ( salTernario > 5000.00 ? salTernario * 0.30 : sal * 0.15);

        // imprima o resultado
        System.out.println("Resultado com utilização de operador ternário:" + resulatdo);

    }

}
