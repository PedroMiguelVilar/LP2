package edu.ufp.inf.lp2._16Teste_Seguros;
import java.util.Date;

public class ApoliceCasa extends Apolice{

    String endereco;
    Date contstrucao;
    float area;

    public ApoliceCasa(int n, Date di, Date df, float c, float pB){
        super(n, di, df, c, pB);
    }

    /*public float premio(){
        return super.premio() + 0.005 * area + 0.01 * this.contstrucao.differenceYears(new Date(System.currentTimeMillis()));
    }*/



}
