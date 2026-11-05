package Contas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private LocalDateTime dataHora;
    private String tipo;
    private double valor;
    private String descricao;


    public Transacao(String tipo, double valor, String descricao) {
            this.dataHora = LocalDateTime.now();
            this.tipo = tipo;
            this.valor = valor;
            this.descricao = descricao;
        }

    @Override
    public String toString() {
        DateTimeFormatter formato =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return "Data: " + dataHora.format(formato)
                + " | Tipo: " + tipo
                + " | Valor: R$ " + valor
                + " | Descricao: " + descricao;
    }

}