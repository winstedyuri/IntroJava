package racao;

import java.util.Scanner;

public class RacaoTrufa {

    public boolean avaliaCondicaoVerdadeira() {
        System.out.println("!!!");
        return true;
    }

    public boolean avaliaCondicaoFalsa() {
        System.out.println("!!!!!!!!");
        return false;
    }

    public static void main(String[] args) {

        // f E f => f
        // f E v => f
        //--------
        // f E * => f.

        RacaoTrufa rt = new RacaoTrufa();
        System.out.println(rt.avaliaCondicaoFalsa()
                && rt.avaliaCondicaoVerdadeira());
        // verdadeiro E verdadeiro => verdadeiro
        // verdadeiro E falso => falso
        // falso E verdadeiro => falso
        // falso E falso => verdadeiro

        // verdadeiro OU verdadeiro => v
        // v OU f => v
        //f OU v => v
        //f OU f => f


        boolean b = !(7>2);
        boolean c = !(1>5);
        System.out.println(b&&c);

//        int quantidadeComidaCopinho = 20;
//        int quantidadeComida3meses = 210;
//        System.out.println((double)
//                quantidadeComida3meses
//                / quantidadeComidaCopinho);
    }

}
