package pkg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ICalculadora calc = new Calculadora();
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Raiz Quadrada");
            System.out.println("6 - Elevar Potência");
            System.out.println("7 - Logaritmo Base 10");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            double n1, n2;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.somar(n1, n2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.subtrair(n1, n2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.multiplicar(n1, n2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    try {
                        System.out.println("Resultado: " + calc.dividir(n1, n2));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Digite o número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.raizquadrada(n1, 0));
                    break;

                case 6:
                    System.out.print("Digite a base: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o expoente: ");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.elevarPotencia(n1, n2));
                    break;

                case 7:
                    System.out.print("Digite o número: ");
                    n1 = sc.nextDouble();
                    try {
                        System.out.println("Resultado: " + calc.logaritmo10(n1));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }

}
