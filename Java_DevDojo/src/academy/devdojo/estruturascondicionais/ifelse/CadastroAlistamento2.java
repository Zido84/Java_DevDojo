package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroAlistamento2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        String sexo;
        int idade;
        String definicao = "";

        System.out.println("Digite seu nome: ");
        nome = entrada.next();

        System.out.println("Digite seu sexo (m)masculino (f)feminino: ");
        sexo = entrada.next();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if ((sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) && (idade < 18)) {
            definicao = "Alistamento não permitido";
        } else if ((sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) && (idade >= 18)) {
            if (sexo.equalsIgnoreCase("m")) {
                definicao = "Alistamento obrigatório";
            } else if (sexo.equalsIgnoreCase("f")) {
                System.out.println("Deseja se alistar (s)sim (n)não ");
                String resposta = entrada.next();
                if (resposta.equalsIgnoreCase("s")) {
                    definicao = "Alistamento realizado com sucesso";
                } else {
                    definicao = "Recusou o alistamento";
                }
            }
        }
        System.out.println(nome + " " + definicao);
    }
}
