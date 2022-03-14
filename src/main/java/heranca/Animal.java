package heranca;

public abstract class Animal {

    int patas;
    String raca;
    int idade;
    Sexo sexo;
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    abstract void fazBarulho();

}
