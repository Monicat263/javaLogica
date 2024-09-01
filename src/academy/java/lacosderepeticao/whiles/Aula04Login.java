/*
    Apresentar ao usuário uma tela solicitando um login e depois uma senha , o usuários e senha
    corretos devem estar armazenados em constantes no seu programa. Se o usuário acertar
    o usuãrio e senha exibir a mensagem ACESSO CONCEDIDO, caso contrário exiba a mensagem
    ACESSO NEGADO e volte a pedir o usuário e senha, essa condição deve-se repetir até que o usuarío
    acerte a combinação.
    Obs: posso usar as variáveis com final String usuario ou como constantes String usuário.
 */

package academy.java.lacosderepeticao.whiles;
import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {

         String USUARIO = "cat123";
         String SENHA = "123#";

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Digite seu usuário: ");
            String usuarioDigitado = input.next();
            System.out.println("Digite sua senha: ");
            String senhaDigitado = input.next();

            if((usuarioDigitado.equals(USUARIO) && senhaDigitado.equals(SENHA))){
                System.out.println("ACESSO CONCEDIDO");
                break;
            }else{
                System.out.println("ACESSO NEGADO");
            }
         }
        input.close();
    }
}
