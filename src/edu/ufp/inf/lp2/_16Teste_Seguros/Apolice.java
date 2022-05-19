package edu.ufp.inf.lp2._16Teste_Seguros;

import java.util.Date;

public class Apolice {

    int numero;
    Date dataInit;
    Date dataFim;
    float cobertura;
    float premioBase;

    public Apolice(int n, Date di, Date df, float c, float pB){
        this.numero=n;
        this.dataInit=di;
        this.dataFim=df;
        this.cobertura=c;
        this.premioBase=pB;
    }

    public int getNumero() {
        return numero;
    }

    public Date getDataInit() {
        return dataInit;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public float getCobertura() {
        return cobertura;
    }

    public void setCobertura(float cobertura) {
        this.cobertura = cobertura;
    }

    public float getPremioBase() {
        return premioBase;
    }

    public void setPremioBase(float premioBase) {
        this.premioBase = premioBase;
    }

    public float premio(){
        return this.premioBase;
    }


}
