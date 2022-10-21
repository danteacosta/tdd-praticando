package boletos;

import boletos.enums.Status;
import boletos.enums.TipoPagamento;

import java.util.Date;

public class Pagamento {

    private double valor;

    private Date data;

    private TipoPagamento tipoPagamento;

    private Fatura fatura;

    public Pagamento(double valor, Date data, TipoPagamento tipoPagamento, Fatura fatura) {
        this.valor = valor;
        this.data = data;
        this.tipoPagamento = tipoPagamento;
        this.fatura = fatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
