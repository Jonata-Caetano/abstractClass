package exemplo.B;

public abstract class Veiculo {

	private String cor = "Verde";
	private int qtdPessoas = 5;
	
	/**
	 * O método abstrato não possui implementação e obriga
	 */
	public abstract void ligar();
	
	public abstract void desligar();
	
	public void locomover() {
		System.out.println("[VEICULO]: locomovendo");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
}
