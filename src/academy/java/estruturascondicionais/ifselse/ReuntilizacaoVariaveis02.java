package academy.java.estruturascondicionais.ifselse;/*
 -- Crie uma variável que irá guardar o valor de um salário, cálcule a porcentagem desse
 -- salário sendo valores da porcentagem:
   -- 30%
   -- 15%
   -- 5%
  -- A cada vez que você calcular guarde o resultado em uma variável, imprima o reseultado e reutilize a variável
  -- que guarde o resultado para o novo cálculo, repetir o processo
  -- Fiz com o IF
 */

public class ReuntilizacaoVariaveis02 {
    public static void main(String[] args) {
        double  sal = 5000.00F;
        float porcetagem = 5L;
        double resultado = 0;

        if(porcetagem == 30 ){
            resultado = sal * (porcetagem /100);

        } else if (porcetagem == 15) {
            resultado = sal * (porcetagem /100);
        }else{
            resultado = sal * (porcetagem /100);
        }
        System.out.println(String.format("%.2f", resultado ));

    }


}
