package Pergunta2;

public class Motocicleta extends VeiculoPasseio {
	double potencia, tipo;

	public Motocicleta(String placa, String cor, String modelo, String fabricante, double anoFabricacao,
			double valorDiaria, double numPortas, double potencia, double tipo) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, numPortas);
		this.potencia = potencia;
		this.tipo = tipo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}
	
	

}
