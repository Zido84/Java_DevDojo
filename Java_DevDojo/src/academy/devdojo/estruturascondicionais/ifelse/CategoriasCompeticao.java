package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CategoriasCompeticao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;
        String nome;
        String categoria;

        System.out.println("Digite seu nome: ");
        nome = entrada.next();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade < 10) {
            categoria = "Infantil";
        } else if (idade >= 11 && idade <= 15) {
            categoria = "Juvenil";
        } else if (idade >= 16 && idade <= 19) {
            categoria = "Pré-Adulto";
        } else {
            categoria = "Adulto";
        }
        System.out.println(nome + " Participara da categoria " + categoria);
        entrada.close();
    }
}
