package pkg;

public class Calculadora implements ICalculadora {

	@Override
	public double somar(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 +n2;
	}

	@Override
	public double subtrair(double n1, double n2) {
		// TODO Auto-generated method stub
		return n2 - n1;
	}

	@Override
	public double multiplicar(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

	@Override
	public double dividir(double n1, double n2) {
		// TODO Auto-generated method stub
		if(n2==0) {
			throw new ArithmeticException("Divisão por zero não é permitida");
		}
		return n2 / n1;
	}

	@Override
	public double raizquadrada(double n1, double n2) {
		// TODO Auto-generated method stub
		return Math.sqrt(n1);
	}

	@Override
	public double elevarPotencia(double n1, double n2) {
		// TODO Auto-generated method stub
		return Math.pow(n1, n2);
	}

	@Override
	public double logaritmo10(double n1) {
		// TODO Auto-generated method stub
		if(n1<=0) {
			throw new ArithmeticException("Logaritmo definido apenas para valores positivos");
		}
		return Math.log10(n1);
	}

}
