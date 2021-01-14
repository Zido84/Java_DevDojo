package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.next();

        while(nome == null || nome.isEmpty() || nome.isBlank()) {
            System.out.println("Nome invalido, digite novamente: ");
            nome = entrada.next();
        }while(nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Nome invalido, digite novamente: ");
            nome = entrada.next();
        }
        System.out.println("O nome digitado foi: " + nome);
    }
}
