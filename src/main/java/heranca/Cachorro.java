package heranca;

public class Cachorro extends Animal {

    Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazBarulho() {
        System.out.println("Auuuuuu");
    }
}
