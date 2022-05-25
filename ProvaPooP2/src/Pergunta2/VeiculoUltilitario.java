package Pergunta2;

public class VeiculoUltilitario extends VeiculoPasseio{
	String tipoTracao, tipo, listaOpcionais;
	double numPortas;
	public VeiculoUltilitario(String placa, String cor, String modelo, String fabricante, double anoFabricacao,
			double valorDiaria, double numPortas, String tipoTracao, String tipo, String listaOpcionais,
			int numPortas2) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, numPortas);
		this.tipoTracao = tipoTracao;
		this.tipo = tipo;
		this.listaOpcionais = listaOpcionais;
		numPortas = numPortas2;
	}
	public String getTipoTracao() {
		return tipoTracao;
	}
	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getListaOpcionais() {
		return listaOpcionais;
	}
	public void setListaOpcionais(String listaOpcionais) {
		this.listaOpcionais = listaOpcionais;
	}
	public double getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	
}
