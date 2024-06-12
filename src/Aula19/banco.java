package Aula19;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Conta c1= new Conta();
        c1.geraidentificador();
        System.out.println("a nova conta tem o identificador "+c1.identificador);
        c1.titular = "jonas";
        c1.depositar(1000);
        if (c1.sacar(1500)){
            System.out.println("saque realizado");
        }
        else{
            System.out.println("saldo insuficiente");
        }
    }

}
