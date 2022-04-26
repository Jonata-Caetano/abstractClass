package exemplo.B;


public class Aviao extends Veiculo{

	@Override
	public void ligar() {
		System.out.println("[AVIAO]: Ligado");
	}
	
	
	public void decolar() {
		System.out.println("[AVIAO]: Decolando");
	}


	@Override
	public void desligar() {
		System.out.println("[AVIAO]: desligado");
	}
	
}
