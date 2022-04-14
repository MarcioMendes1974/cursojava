package beans;

public class ContaCorrente {
    private int numcc;
    private int tpcc;
    private double saldo;
    private String nomeclie;
    private double limite;

    public int getTpcc() {
        return tpcc;
    }

    public void setTpcc(int tpcc) {
        this.tpcc = tpcc;
    }

    public int getNumcc() {
        return numcc;
    }

    public void setNumcc(int numcc) {
        this.numcc = numcc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeclie() {
        return nomeclie;
    }

    public void setNomeclie(String nomeclie) {
        this.nomeclie = nomeclie;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
