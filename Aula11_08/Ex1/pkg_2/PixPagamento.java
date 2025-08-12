package pkg_2;

public class PixPagamento extends MetodoPagamento {
    private String chavePix;

    public PixPagamento(String chavePix) {
        super("PIX");
        this.chavePix = chavePix;
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PIX...");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("=== Detalhes do Pagamento ===");
        System.out.println("Método: " + nomeMetodo);
        System.out.println("ID Pagamento: " + idPagamento);
        System.out.println("Chave PIX: " + chavePix);
    }
}