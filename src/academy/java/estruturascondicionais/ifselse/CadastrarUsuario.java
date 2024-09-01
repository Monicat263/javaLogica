package academy.java.estruturascondicionais.ifselse;/*
     -- Eu, como administrador deo sistema, gostaira de permitir que os próprios usuários
     -- cadastrasse o nome de usuários (login0 no sistema para agilizar
     -- o processo de migração deo sistema antigo para o novo.

     -- O usuários não pode deixar o login vazio " ", ou criar um usuário com login "admin" ou "administrador".
     -- Se o valor de entrada for válido, o sistema deverá exibir uma msg <nome do usuário> cadastrado c/ sucesso
     -- Senão o sistema deverá mostrar o erro "invárlido"
 */

import java.util.Scanner;

public class CadastrarUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inclua o login do novo usuário: ");
        String novoLoginUsuario = input.next().trim();
        if ( novoLoginUsuario.isBlank() // Verifica se está vazio ou é composto apenas por espaços em branco
                || novoLoginUsuario.equalsIgnoreCase("ADMIN")
                || novoLoginUsuario.equalsIgnoreCase("ADMINISTRADOR")) {
            System.out.println(" Usuário inválido");
        }else {
            System.out.println("Usuário: " + novoLoginUsuario + " cadastrado com sucesso!!!");
        }
        input.close();
    }
}
