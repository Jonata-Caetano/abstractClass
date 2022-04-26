package exemplo.B;

public class Carro extends Veiculo {

	@Override
	public void ligar() {
		System.out.println("[CARRO]: ligado");
	
	}
	
	@Override
	public void desligar() {
		System.out.println("[CARRO]: desligado");
	}
	
	@Override
	public void locomover() {
		System.out.println("[CARRO]: locomovendo");
	}
}
