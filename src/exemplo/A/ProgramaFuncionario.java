package exemplo.A;

public class ProgramaFuncionario {

	public static void main(String[] args) {

		//Funcionario funcionario = new Funcionario("Pedro", 2000.00);
		
		
		/**
		 * Nesse caso, o funcionario Pedro, nao deveria existir. A pergunta e Mas, quem e Pedro?
		 * Ele e um Dev, um Gerente?
		 * 
		 * Como podemos fazer para evitar a criacao de um funcionario sem alguma funcao?
		 * Resposta: Classes Abstratas.
		 * 
		 * A partir do momento que a Classe Funcionario se torna abstrata, nao e mais possivel criar algo concreto a partir dela, ou seja nao pode dar new.
		 * Classes abstratas foram criadas com o objetivo de serem extendidas.
		 * Nao se pode criar uma Classe abstrata da seguinte forma, public final abstract, pois o final significa que a classe nao pode ser extendida.
		 * 
		 * O verdadeiro poder das Classes Abstratas vem do fato de voc� poder criar metodos abstratos.
		 * Metodos abstratos so pode existir em Classes Abstratas
		 */
		Gerente gerente = new Gerente("Maria", 5000.00);
		System.out.println(gerente);
		gerente.imprime();
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 5000);
		System.out.println(desenvolvedor);
		desenvolvedor.imprime();
		desenvolvedor.imprime1();
	}

}
