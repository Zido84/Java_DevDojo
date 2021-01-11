import java.util.Scanner;

public class PercentSalario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float salarioBase;
        int percent;

        System.out.println("Entre com o valor do salario: ");
        salarioBase = entrada.nextFloat();

        System.out.println("Qual o percentual que você quer calcular? ");
        percent = entrada.nextInt();

        float calculoPercentual = salarioBase * percent / 100;

        System.out.println("O valor percentual é: " + calculoPercentual);

        entrada.close();
    }
}
