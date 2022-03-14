package enums;

public class Automovel {

    String cor;
    int ano;


    TipoAutomovel tipoAutomovel;

    public TipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(TipoAutomovel tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
