package Aula21.ExemploHeranca;

public class Principal {
    static void main(String[] args) {
        Motorista m1 = new Motorista("Jonas", "Silva");
        m1.setNome ("jonas");
        m1.setSobrenome ("Silva");
        m1.setSalario (1000);
        m1.setCnh("5252642");

        Engenheiro e1 = new Engenheiro ("Gabriel", "Camargo");
        e1.setNome("Gabriel");
        e1.setSobrenome("Camargo");
        e1.setSalario(1000);
        e1.setCrea("11111");

    }

}
