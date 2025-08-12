package pkg_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodoPagamento pagamento = null;
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE PAGAMENTO ===");
            System.out.println("1 - Cartão de Crédito");
            System.out.println("2 - PayPal");
            System.out.println("3 - PIX");
            System.out.println("0 - Sair");
            System.out.print("Escolha o método de pagamento: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite o valor do pagamento: R$ ");
            double valor = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número do cartão: ");
                    String numeroCartao = sc.nextLine();
                    System.out.print("Digite o nome do titular: ");
                    String nomeTitular = sc.nextLine();
                    pagamento = new CartaoCreditoPagamento(numeroCartao, nomeTitular);
                    break;

                case 2:
                    System.out.print("Digite o e-mail do PayPal: ");
                    String email = sc.nextLine();
                    pagamento = new PayPalPagamento(email);
                    break;

                case 3:
                    System.out.print("Digite a chave PIX: ");
                    String chavePix = sc.nextLine();
                    pagamento = new PixPagamento(chavePix);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            if (pagamento != null) {
                pagamento.processaPagamento(valor);
                pagamento.mostraDetalhesPagamento();
            }

        } while (opcao != 0);

        sc.close();
    }
}
