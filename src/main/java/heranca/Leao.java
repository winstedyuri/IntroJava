package heranca;

public class Leao extends Felino {

    Leao(String nome) {
        super(nome);
    }

    @Override
    void fazBarulho() {
        System.out.println("Barulho de rugido");
    }
}
