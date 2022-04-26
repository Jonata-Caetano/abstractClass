package exemplo.A;

/*
 * A Classe concreta, deverá implementar os métodos abstratos da Classe Pessoa, neste caso ou a Classe Filha de Pessoa (Funcionário).
 */
public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void calculaBonus() {
		this.salario += this.salario * 0.5;
	}
	
	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		
	}
	
}
