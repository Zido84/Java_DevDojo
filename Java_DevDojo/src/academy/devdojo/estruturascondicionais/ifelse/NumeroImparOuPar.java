package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class NumeroImparOuPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor;
        System.out.println("Digite um numero: ");
        int numero1 = entrada.nextInt();

        if (numero1 % 2 == 0){
            valor = "par";
        }else{
            valor = "impar";
        }
        System.out.println(valor);
    }
}
