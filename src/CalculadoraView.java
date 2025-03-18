package src;


import java.util.Scanner;

public class CalculadoraView {
    private Scanner scanner;

    public CalculadoraView() {
        scanner = new Scanner(System.in);
    }

    public void exibirResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public String lerOperacao() {
        System.out.print("Escolha a operação (+, -, *, /): ");
        return scanner.next();
    }
}