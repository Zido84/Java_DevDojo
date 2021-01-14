package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class ContaPoupanca {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto você quer depositar? ");
        float valorDeposito = entrada.nextFloat();
        float calculoJurosCompostos = 0;
        System.out.println("Digite o tipo de conta: ");
        System.out.println("Conta Poupança (1)");
        System.out.println("Conta Corrente (2)");
        System.out.println("Conta Investimento (3)");

        int tipoConta = entrada.nextInt();
        String descricaoConta = "";

        switch (tipoConta) {
            case 1:
                calculoJurosCompostos = (float) (valorDeposito + (valorDeposito * 0.05));
                descricaoConta = "CONTA_POUPANÇA: 0.05%";
                break;
            case 2:
                calculoJurosCompostos = (float) (valorDeposito + (valorDeposito * 0.02));
                descricaoConta = "CONTA_CORRENTE: 0.02%";
                break;
            case 3:
                calculoJurosCompostos = (float) (valorDeposito + (valorDeposito * 0.01));
                descricaoConta = "CONTA_INVESTIMENTO: 0.01%";
                break;
            default:
                System.out.println("Conta inexistente");
                break;
        }
        System.out.println(descricaoConta + " Total após prazo de rendimento: " + calculoJurosCompostos);

        entrada.close();
    }
}
