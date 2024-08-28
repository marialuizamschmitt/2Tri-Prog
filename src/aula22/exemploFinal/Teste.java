package aula22.exemploFinal;

public class Teste {
    public static void main(String[] args) {
        //Acesso a uma constante
        System.out.println(Operacao.PI);
        Operacao op = new Operacao ();
        //Acessar um atributo final;
        System.out.println(op.pi);
        ///Não é ossivel acessar um valor de atributo final

    }

}
