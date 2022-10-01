import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        double raio;
        double area;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva abaixo o valor do raio: ");
        raio = teclado.nextDouble();

        area = Math.PI * (Math.pow(raio,2));

        System.out.print("Area do Circulo é: " + area);
        
        teclado.close();

    }

}