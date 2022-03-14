package heranca;

public class Gato extends Animal {

    boolean vacinado;

    Gato() {
        super("bob");
    }

   void miar() {
       System.out.println("Miauuuuuuuu");
   }

    @Override
    void fazBarulho() {
        miar();
    }
}
