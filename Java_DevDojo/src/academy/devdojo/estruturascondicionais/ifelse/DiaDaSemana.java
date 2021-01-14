package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero referente ao dia  da semana: ");
        int diaNumero = entrada.nextInt();

        String diaSemana = "";

        if (diaNumero == 1) {
            diaSemana = "Domingo";
        } else if (diaNumero == 2) {
            diaSemana = "Segunda";
        } else if (diaNumero == 3) {
            diaSemana = "Terça";
        } else if (diaNumero == 4) {
            diaSemana = "Quarta";
        } else if (diaNumero == 5) {
            diaSemana = "Quinta";
        } else if (diaNumero == 6) {
            diaSemana = "Sexta";
        } else if (diaNumero == 7) {
            diaSemana = "Sábado";
        }else {
            System.out.println("Dia Inválido");
        }
        System.out.println("O dia correspondente é: " + diaSemana);
        entrada.close();
    }
}
