package exemplo.B;

public class Onibus extends Veiculo  {
	
	@Override
	public void desligar() {
		System.out.println("[ONIBUS]: desligado");
	}
	
	@Override
	public void locomover() {
		System.out.println("[ONIBUS]: locomovendo");
	}

	@Override
	public void ligar() {
		System.out.println("[ONIBUS]: ligado");
	
	}

}
