package contas1;

public class Conta {
    private String titular;
    private Double saldo = 0.0;
    private String numero;

    public void depositar (Double valorDepositar) {
        saldo = saldo + valorDepositar;
    }

    public void retirar (Double valorRetirar) {
        saldo = saldo - valorRetirar;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }
}
