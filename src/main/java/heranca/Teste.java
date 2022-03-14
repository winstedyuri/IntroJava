package heranca;

public class Teste {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.idade = 1;
        Animal gato = new Gato();
//        gato.vacinado = false;
        Gato gato2 = new Gato();
        gato2.vacinado = true;

        cachorro.fazBarulho();
        gato.fazBarulho();
        gato2.miar();
    }
}