package Contas;

import java.util.List;
import java.util.ArrayList;

public class ContaBancaria {

    private String titular;
    private String numero;
    private double saldo;
    private List <Transacao> historico = new ArrayList<>();

    public ContaBancaria() {
        this.titular = "";
        this.numero = "";
        this.saldo = 0.0;
    }

    public ContaBancaria(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0; 
    }

    public List<Transacao> getHistorico() {
        return new ArrayList<>(historico);
    } 

    public ContaBancaria(String titular, String numero, double saldo) {
        this.titular = titular; 
        this.numero = numero;
        this.saldo = saldo;
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inválido."); 
        }
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
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override 
    public String toString() {
        return "ContaBancaria [titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

    public void depositar(double valor) {
        saldo += valor;  //saldo = saldo + valor;
        Transacao transacao = new Transacao(
        "Deposito", valor, "Deposito em conta"
        );

        historico.add(transacao);
    }

    public boolean retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        Transacao transacao = new Transacao(
                "Retirada", valor, "Retirada de conta"
            );
            historico.add(transacao);
            return true;
        } else {
            return false;
        }
    }

    public void retirar1(double valor) {
    if (valor > saldo) {
        throw new IllegalArgumentException(
            "Saldo insuficiente para a retirada."
        );
    }

    saldo -= valor;

    Transacao transacao = new Transacao(
        "Retirada", valor, "Retirada em conta"
    );

    historico.add(transacao);
}

}   
