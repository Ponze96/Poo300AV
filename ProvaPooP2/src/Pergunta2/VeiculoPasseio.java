package Pergunta2;

public abstract class VeiculoPasseio {
	String placa, cor, modelo, fabricante;
	double anoFabricacao, valorDiaria, numPortas;
	public VeiculoPasseio(String placa, String cor, String modelo, String fabricante, double anoFabricacao,
			double valorDiaria, double numPortas) {
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoFabricacao = anoFabricacao;
		this.valorDiaria = valorDiaria;
		this.numPortas = numPortas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(double anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public double getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(double numPortas) {
		this.numPortas = numPortas;
	}
	
	
	
	

}
