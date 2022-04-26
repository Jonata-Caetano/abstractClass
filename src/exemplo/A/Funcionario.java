package exemplo.A;

/**
 * A Class Funcionario � um template, ou seja � abstrato.
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
	 * S�o metodos que nao possuem implementacao
	 * Metodos precisam ser abstratos quando a classe e generica demais para conter sua implementacao
	 * 
	 * Cen�rio: Calcular um bonus para todos os funcionarios.
	 * Agora toda Classe que extende Funcionario deve implementar esse m�todo.
	 * Podemos ter m�todos concretos dentro de classes Abstratas.
	 * Exemplo: Um m�todo para deletar Funcionarios, ser� um para todos os tipos de Funcionarios.
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

