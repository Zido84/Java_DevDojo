public class PercentualSalario {
    public static void main(String[] args) {

        float salario = 5000;
        int percent30 = 30;
        int percent15 = 15;
        int percent5 = 5;

        float resultado;

        System.out.println("O calculo de 30% é: " + salario * percent30 / 100);
        System.out.println("O calculo de 15% é: " + salario * percent15 / 100);
        System.out.println("O calculo de 5% é: " + salario * percent5 / 100);
    }
}
