package clases;

public class Quini6 {

	public void entrar(Jugador jugador) {
		if (jugador.getCantVecesQueGanoQuini6()==0) {
			jugador.modificarDinero(50000);
			jugador.GanoQuini6();
		}
		else{
			jugador.modificarDinero(30000);
		}
	}

}
