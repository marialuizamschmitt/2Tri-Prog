package aula22.exemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite um número");
            int n1 = ler.nextInt();
            System.out.println("Digite outro número");
            int n2 = ler.nextInt();
            int resposta = n1 / n2;
            System.out.println(resposta);
        }

        catch (InputMismatchException erro){
            System.out.println("Os valores precisam ser números");
        }
        catch (ArithmeticException erro){
            System.out.println("Não é possível dividir por 0");
        }
        finally {
            System.out.println("Sou sempre executado!"); // inutil
        }
    }
}
