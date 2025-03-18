package src;

public class CalculadoraController {
    private CalculadoraView view;

    public CalculadoraController(CalculadoraView view) {
        this.view = view;
    }

    public void executar() {
        double num1 = view.lerNumero("Digite o primeiro número: ");
        double num2 = view.lerNumero("Digite o segundo número: ");
        String operacao = view.lerOperacao();

        Operacao operacaoSelecionada = null;

        switch (operacao) {
            case "+":
                operacaoSelecionada = new Soma();
                break;
            case "-":
                operacaoSelecionada = new Subtracao();
                break;
            case "*":
                operacaoSelecionada = new Multiplicacao();
                break;
            case "/":
                operacaoSelecionada = new Divisao();
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        try {
            double resultado = operacaoSelecionada.calcular(num1, num2);
            view.exibirResultado(resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro inesperado: " + ex.getMessage());
        }
    }
}