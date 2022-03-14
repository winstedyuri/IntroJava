package enums;

public class Teste {

    public static void main(String[] args) {

            Conta conta = new Conta();
            conta.setTipoConta(15);
            conta.setTipoDaConta(TipoConta.CONTA_CORRENTE);
            conta.setTipoDaConta(TipoConta.CONTA_POUPANCA);

            Automovel gol = new Automovel();
            gol.setTipoAutomovel(TipoAutomovel.CARRO);
            gol.setAno(2002);
            gol.setCor("Verde");

            Automovel uno = new Automovel();
            uno.setTipoAutomovel(TipoAutomovel.CARRO);
            uno.setAno(2007);
            uno.setCor("Roxo");

            Automovel moto = new Automovel();
            moto.setTipoAutomovel(TipoAutomovel.MOTOCICLETA);

            System.out.println(gol.getTipoAutomovel().numeroRodas);
            System.out.println(uno.getTipoAutomovel().numeroRodas);
            System.out.println(moto.getTipoAutomovel().numeroRodas);

    }

}
