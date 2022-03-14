package heranca;

public class Teste {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Trufa");
        cachorro.idade = 1;
        Animal gato = new Gato();
//        gato.vacinado = false;
        Gato gato2 = new Gato();
        gato2.vacinado = true;

        cachorro.fazBarulho();
        System.out.println(cachorro.nome);
        gato.fazBarulho();
        gato2.miar();

        Animal peixe = new Peixe("Linguado");
        peixe.fazBarulho();
    }
}