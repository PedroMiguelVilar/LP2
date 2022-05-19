package edu.ufp.inf.lp2._16Teste_Seguros;

import java.util.Date;

public class Cliente {

    int nif;
    String nome;
    Date nasceu;
    int carta;
    Date dataCarta;

    public Cliente(int n, String no, Date na, int c, Date dC){
        this.nif = n;
        this.nome = no;
        this.nasceu = na;
        this.carta = c;
        this.dataCarta = dC;
    }

    public Apolice[] apolices(Date di, Date df){
        /*Apolice[] IntArray = new Apolice[2];
        IntArray[0]=di;
        IntArray[1]=df;
        return IntArray;*/

        return null;
    }

    public Apolice[] apolices(String type){
        return null;
    }

}
