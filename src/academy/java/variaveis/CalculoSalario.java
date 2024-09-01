package academy.java.variaveis;/*
* Crie uma classe que cálcule uma determinada porcentagem de um daddo salário
* * Crie uma clase que  aceite  um valor  de entrada para o salário
* Definir o valor da porcentagem
* Calcular a porcentagem
 */

public class CalculoSalario {
    public static void main(String[] args) {
       double salBruto = 2500.00F;
       float porcentagem = 30L;
       double calculoValorPorcentagemSal = salBruto * (porcentagem/100);

        System.out.println("A porcentagem para desconto do salário é de: "
                + String.format("%.2f",calculoValorPorcentagemSal));
    }
}