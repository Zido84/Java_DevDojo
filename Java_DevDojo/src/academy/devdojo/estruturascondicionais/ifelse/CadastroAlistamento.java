package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroAlistamento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String definicao = "";
        String respostaAlistamento;
        System.out.println("Digite seu sexo(M) ou (F): ");
        String sexo = entrada.next();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (sexo.equalsIgnoreCase("m") && idade >= 18) {
            definicao = "Alistamento obrigatório";
        } else if (sexo.equalsIgnoreCase("m") && idade < 18) {
            definicao = "Alistamento não permitido";
        } else if (sexo.equalsIgnoreCase("f") && idade >= 18) {
            System.out.println("Deseja se alistar? sim(s) não(n)");
            respostaAlistamento = entrada.next();
            if (respostaAlistamento.equalsIgnoreCase("s")) {
                definicao = "Alistamento aceito";
            }else{
                definicao = "Alistamento recusado";
            }
        } else if (sexo.equalsIgnoreCase("f") && idade < 18) {
            definicao = "Alistamento não permitido";
        }
        System.out.println(definicao);
        entrada.close();
    }
}
