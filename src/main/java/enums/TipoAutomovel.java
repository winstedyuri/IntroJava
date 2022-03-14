package enums;

public enum TipoAutomovel {

    MOTOCICLETA(2), CARRO(4);

    int numeroRodas;

    private TipoAutomovel(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

}
