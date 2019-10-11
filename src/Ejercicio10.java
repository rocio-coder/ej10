import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        double telapulgadas, cantidaddemetros;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("ingrese la medida de la tela en pulgadas");
        telapulgadas = keyboard.nextDouble();
        cantidaddemetros = telapulgadas * 2.54;
        System.out.println("la cantidad de metros " + cantidaddemetros);

    }
}
