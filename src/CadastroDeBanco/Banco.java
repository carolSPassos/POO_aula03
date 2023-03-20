package CadastroDeBanco;

public class Banco {

    private double total;
    private double saque;
    private double deposito;

    public void total(double total) {
       this.total = total;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaque() {
        total = total - saque;
        return total;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        total = total + deposito;
        return total;
    }


}
