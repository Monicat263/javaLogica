package academy.java.estruturascondicionais.ifselse;
/*
    Eu como usuário gostaria de ter o nome e idade de participantes de um torneiro de natação e que o sistema
    imprimiesse da seguinte forma:
        -- Se for menor de 10 anos: <Nome> participará da categoria infantil.
        -- Se idade esta entre 11 e 15 anos : <Nome>  participaráda categoria Juvenil
        -- Se existiver entre 16 e 19 anos : <Nome> participará da categoria Pré adulto
        -- Acima de 20 anos  : <Nome> participará da categoria Adulto
     Para que eu posso rapidamente classificar todos os particpantes
     Leitura complementar:
        -- Proceso de desenvolvimento de software
        -- Metodologia ágeis
        -- SCRUM
 */

public class TorneioDeNatacao01 {
    public static void main(String[] args) {
        int idade = 20;
        String nome = "João";
        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade <= 10) {
            System.out.println("Paricipante: " + nome + " - Categoria: Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("Paricipante: " + nome + " - Categoria: Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("Paricipante: " + nome + " - Categoria: Pré adulto");
        } else if (idade > 20) {
            System.out.println("Paricipante: " + nome + " - Categoria: Adulto");
        } else {
            System.out.println("Paricipante: " + nome + " - Categoria: Sem classificação");
        }
    }
}
