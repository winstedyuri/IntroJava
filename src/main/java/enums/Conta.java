package enums;

public class Conta {


    int tipoConta; // 0 => Conta Corrente, 1 => Conta Poupança;
    String tipoContaTexto; //"Conta Corrente";
    boolean contaCorrente; //true => conta corrente, false => conta poupança;
    TipoConta tipoDaConta;

    public TipoConta getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(TipoConta tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }


}
