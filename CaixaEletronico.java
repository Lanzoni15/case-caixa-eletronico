public class CaixaEletronico {
    private double saldo;
    private double depositar;
    private double sacar;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    // CONSTRUTORES

    public double depositando(double depositar) {
        return saldo += depositar;
    }

    public double sacando() {
        return saldo -= sacar;
    }
}
