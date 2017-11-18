/*
 * Programa que asemeja el juego "Serpientes y escaleras"
 */
package jugador;


public class SerpientesEscaleras {
	public static void main(String[] args) {
		int[] cabezaSerpiente= {4,8,33,37,42,64,69};
		int[] colaSerpiente= {40,30,90,54,79,98,93};
		int[] pieEscalera= {3,14,31,44,47,63,72};
		int[] cimaEscalera= {39,35,70,65,86,83,91};
		int tJugadores=0,posicion=0,dado1,dado2,dados;
		String nombre;
		boolean ganador=false;
		System.out.println("Serpientes y Escaleras");
		do {
			System.out.print("Total de jugadores: ");
			tJugadores=Keyboard.readInt();
		} while(tJugadores<2);
		Jugador[] jugador= new Jugador[tJugadores];
		for (int i = 0; i < jugador.length; i++) {
			System.out.print("Nombre del jugador "+(i+1)+": ");
			nombre=Keyboard.readString();
			jugador[i]= new Jugador(nombre);
		}
		System.out.println("\nCOMIENZA EL JUEGO");
		do {
			for (int j = 0; j < jugador.length; j++) {
				while(!ganador) {
					System.out.println("Turno de "+jugador[j].getNombre());
					System.out.println("Estás en la posición "+jugador[j].getPosicion());
					System.out.print("1 - Si  2 - No \n¿Deseas lanzar los dados?: ");
					int r=Keyboard.readInt();
					if(r==1) {
						dado1=1+(int)(Math.random()*6);
						dado2=1+(int)(Math.random()*6);
						dados=dado1+dado2;
						posicion=jugador[j].getPosicion()+dados;
						if(posicion>100) posicion=100-(posicion-100);
						jugador[j].setPosicion(posicion);
						System.out.println("Dado 1: "+dado1+" Dado 2: "+dado2);
						System.out.println("Ahora estás en la posición "+jugador[j].getPosicion()+"\n");
						if(jugador[j].getPosicion()==100) {
							System.out.println(jugador[j].getNombre()+" has ganado llegaste a la posición "+jugador[j].getPosicion());
							ganador=true;
						}
					}
					else 
						System.out.println("Te quedas en la posción "+posicion+" \n");
				}
			}
		} while (posicion!=100);
	}

}
