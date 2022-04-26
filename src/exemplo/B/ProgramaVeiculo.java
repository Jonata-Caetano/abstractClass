package exemplo.B;

public class ProgramaVeiculo {

	public static void main(String[] args) {
		
//		Veiculo veiculo = new Veiculo();
		Carro carro = new Carro();
		Aviao aviao = new Aviao();
		Onibus onibus = new Onibus();
		
//		veiculo.ligar();
		carro.ligar();
		aviao.ligar();
		onibus.ligar();
	}

}
