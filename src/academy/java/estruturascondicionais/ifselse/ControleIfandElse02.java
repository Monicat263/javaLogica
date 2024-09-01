package academy.java.estruturascondicionais.ifselse;/*
  -- Receba uma idade como entrada
       -- se idade for maior que 18 impirma "adulto"
       -- senão immpima "não aldulto"
 */

public class ControleIfandElse02 {
    public static void main(String[] args) {
        int idade = 19;

        if(idade > 18){
            System.out.println("Adulto");
        }else{
            System.out.println("Não adulto");
        }

    }
}
