package heranca;

public class Peixe extends Animal {


    Peixe(String nome) {
        super(nome);
    }

    @Override
    void fazBarulho() {
        System.out.println("Glubbb Glubb");
    }
}
