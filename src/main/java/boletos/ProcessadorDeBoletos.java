package boletos;

import boletos.enums.Status;
import boletos.enums.TipoPagamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessadorDeBoletos {

    private List<Pagamento> pagamentosList;

    public ProcessadorDeBoletos() {
        this.pagamentosList = new ArrayList<>();
    }

    public void processaBoletos(List<Boleto> boletoList, Fatura fatura) {
        double totalPago = 0;
        for (Boleto boleto:
             boletoList) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), new Date(), TipoPagamento.BOLETO, fatura);
            this.pagamentosList.add(pagamento);
            totalPago += boleto.getValor();
        }
        if (totalPago >= fatura.getTotal()) {
            fatura.setStatus(Status.PAGO);
        } else fatura.setStatus(Status.AGUARDANDO_PAGAMENTO);
    }

}
