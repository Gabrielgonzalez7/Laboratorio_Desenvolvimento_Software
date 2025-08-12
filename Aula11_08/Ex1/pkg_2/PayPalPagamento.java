package pkg_2;

public class PayPalPagamento extends MetodoPagamento {
	private String email;

    public PayPalPagamento(String email) {
        super("PayPal");
        this.email = email;
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal...");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("=== Detalhes do Pagamento ===");
        System.out.println("Método: " + nomeMetodo);
        System.out.println("ID Pagamento: " + idPagamento);
        System.out.println("E-mail: " + email);
    }
	
}
