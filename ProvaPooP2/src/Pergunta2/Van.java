package Pergunta2;

public class Van extends VeiculoPasseio {
	int numPassageiros, numEixos;

	public Van(String placa, String cor, String modelo, String fabricante, double anoFabricacao, double valorDiaria,
			double numPortas, int numPassageiros, int numEixos) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, numPortas);
		this.numPassageiros = numPassageiros;
		this.numEixos = numEixos;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public int getNumEixos() {
		return numEixos;
	}

	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}
	
	

}
