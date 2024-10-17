public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador("Richard", 22, "Peru", 2);

        System.out.println("Acciones realizadas por el jugador 1: ");
        jugador1.patear();
        jugador1.correr();

        System.out.println("\nAcciones realizadas por el jugador 2: ");
        jugador2.patear();
        jugador2.correr();
        jugador2.saltar(2);
    }
}