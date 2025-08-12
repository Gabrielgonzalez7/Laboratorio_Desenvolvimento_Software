package pkg_2;

public class CartaoCreditoPagamento extends MetodoPagamento {

	 private String numeroCartao;
	    private String nomeTitular;

	    public CartaoCreditoPagamento(String numeroCartao, String nomeTitular) {
	        super("Cartão de Crédito");
	        this.numeroCartao = numeroCartao;
	        this.nomeTitular = nomeTitular;
	    }

	    @Override
	    public void processaPagamento(double valor) {
	        System.out.println("Processando pagamento de R$ " + valor + " via Cartão de Crédito...");
	    }

	    @Override
	    public void mostraDetalhesPagamento() {
	        System.out.println("=== Detalhes do Pagamento ===");
	        System.out.println("Método: " + nomeMetodo);
	        System.out.println("ID Pagamento: " + idPagamento);
	        System.out.println("Titular: " + nomeTitular);
	        System.out.println("Número do Cartão: **** **** **** " +
	                numeroCartao.substring(numeroCartao.length() - 4));
	    }	
		
	
	

}
