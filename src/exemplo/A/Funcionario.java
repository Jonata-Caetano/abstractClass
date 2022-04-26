package exemplo.A;

/**
 * A Class Funcionario é um template, ou seja é abstrato.
 */
public abstract class Funcionario extends Pessoa{

	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}

	/**
	 * São metodos que nao possuem implementacao
	 * Metodos precisam ser abstratos quando a classe e generica demais para conter sua implementacao
	 * 
	 * Cenário: Calcular um bonus para todos os funcionarios.
	 * Agora toda Classe que extende Funcionario deve implementar esse método.
	 * Podemos ter métodos concretos dentro de classes Abstratas.
	 * Exemplo: Um método para deletar Funcionarios, será um para todos os tipos de Funcionarios.
	 */
	public abstract void calculaBonus();

	@Override
	public void imprime() {
		System.out.println("Imprimindo...");
		
	}
	
//	@Override
//	public void imprime1() {
//		System.out.println("Imprime 2");
//	}
	
}

