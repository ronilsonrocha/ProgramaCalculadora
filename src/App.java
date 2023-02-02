
//Classes 
import java.util.Locale;
import java.util.Scanner;

import Calc.Pacotes;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char op;
        do {
            System.out.println("Entre com dois números");
            System.out.print("Digite primeiro número:");
            double x = sc.nextDouble();
            System.out.print("Digite segundo número:");
            double y = sc.nextDouble();

            // instanciação
            Pacotes pac = new Pacotes(x, y);

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Escolha a operação");
            System.out.println("x Multiplicação");
            System.out.println("/ Divisão");
            System.out.println("+ Adição");
            System.out.println("- Subtração");
            op = sc.next().charAt(0);
            if (op == 'x' || op == 'X') {
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                // chamado da classe com a função
                System.out.printf("Resultado = %.2f%n", pac.Mult());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

            }
            if (op == '/') {
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                // chamado da classe com a função
                System.out.printf("Resultado = %.2f%n", pac.Div());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

            }
            if (op == '+') {
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                // chamado da classe com a função
                System.out.printf("Resultado = %.2f%n", pac.Adi());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

            }
            if (op == '-') {
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                // chamado da classe com a função
                System.out.printf("Resultado = %.2f%n", pac.Sub());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

            }

            System.out.println();
            System.out.println("F Fazer outra operação?");
            System.out.println("S Sair do  programa?");
            op = sc.next().charAt(0);
        } while (op != 's' && op != 'S');

        //fim do programa
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+Você saiu do programa!                       +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        sc.close();
    }
}
