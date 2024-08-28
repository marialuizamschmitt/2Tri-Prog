package aula22.exemploExcecao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean valido;

        do {
            try {
                System.out.println("Digite um número");
                int n1 = ler.nextInt();
                System.out.println("Digite outro número");
                int n2 = ler.nextInt();
                int resposta = n1 / n2;
                System.out.println(resposta);
                valido =true;
            } catch (InputMismatchException erro) {
                System.out.println("Os valores precisam ser números");
                ler.next();
                valido = false;
            } catch (ArithmeticException erro) {
                System.out.println("Não é possível dividir por 0");
                valido = false;
            }

        }while(!valido);
    }


}
