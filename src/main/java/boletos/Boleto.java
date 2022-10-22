package boletos;

public class Boleto {

    private String data;

    private double valor;

    private String codigo;

    public Boleto(String codigo, double valor, String data) {
        this.data = data;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
