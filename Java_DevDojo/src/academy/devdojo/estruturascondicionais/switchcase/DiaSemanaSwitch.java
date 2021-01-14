package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class DiaSemanaSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero referente a um dia da semana: ");
        int diaNumero = entrada.nextInt();
        String diaSemana = "";
        switch (diaNumero) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
            default:
                diaSemana = "Dia inválido";
                break;
        }
        System.out.println(diaSemana);
    }
}
