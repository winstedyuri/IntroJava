package heranca;

public class Gato extends Animal {


    boolean vacinado;

    void miar() {
        System.out.println("Miauuuuuuuuuuu");
    }

    @Override
    void fazBarulho() {
        miar();
    }
}
