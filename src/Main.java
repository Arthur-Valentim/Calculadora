package src;
public class Main {
    public static void main(String[] args) {
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(view);
        controller.executar();
    }
}