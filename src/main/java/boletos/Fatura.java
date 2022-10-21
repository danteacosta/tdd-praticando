package boletos;

import boletos.enums.Status;

public class Fatura {

    private String data;

    private double total;

    private String nome;

    private Status status;

    public Fatura(String data, double total, String nome) {
        this.data = data;
        this.total = total;
        this.nome = nome;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
