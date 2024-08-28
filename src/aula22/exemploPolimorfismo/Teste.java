package aula22.exemploPolimorfismo;

import aula22.exemploFinal.Operacao;

public class Teste {
    public static void main(String[] args) {
        Operacoes op  = new Operacoes();

        System.out.println("Somando dois números: "+op.soma(5,2));
        System.out.println("Somando tres números: "+op.soma(5,3,10));
        System.out.println("Somando duas Strings "+op.soma("Programação", "Java"));
    }
}
