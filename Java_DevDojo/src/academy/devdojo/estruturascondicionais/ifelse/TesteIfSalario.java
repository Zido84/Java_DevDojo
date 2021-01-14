package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TesteIfSalario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float salario;
        float percentual;
        int percent;

        System.out.println("Digite seu salario: ");
        salario = entrada.nextFloat();

        if (salario >= 4500) {
            percent = 30;
            percentual = salario * percent / 100;
        } else {
            percent = 15;
            percentual = salario * percent / 100;
        }
        System.out.println("O valor final é: " + percentual + "\nQue corresponde a " +
                percent + "% " + "do salario: " + salario);
        entrada.close();
    }
}
