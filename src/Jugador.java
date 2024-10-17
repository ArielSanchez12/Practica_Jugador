public class Jugador {
    String avatar;
    int edad;
    String pais;
    int num_jugador;
    int saltos = 2;

    public Jugador() {
        avatar = "Ariel"; //Para constructores vacios no hace falta usar el this.variable = variable
        edad = 21;
        pais = "Ecuador";
        num_jugador = 1;
    }

    public Jugador(String avatar, int edad, String pais, int num_jugador) {
        this.avatar = avatar; //Aqui si se usa el this.variable = variable ya que la variable se llama igual en ambos lados y el programa necesita diferenciarlos
        this.edad = edad;
        this.pais = pais;
        this.num_jugador = num_jugador;
    }


    public void patear(){
        System.out.println("El jugador " + num_jugador + " de nombre: " + avatar +
                            ", edad: " + edad + ", pais: " + pais +
                            ", ha realizado la accion patear");
    }

    public void correr(){
        System.out.println("El jugador " + num_jugador + " de nombre: " + avatar +
                ", edad: " + edad + ", pais: " + pais +
                ", ha realizado la accion correr");
    }

    public void saltar(int saltos){
        saltos += saltos;
        System.out.println("El jugador " + num_jugador + " de nombre: " + avatar +
                ", edad: " + edad + ", pais: " + pais +
                ", ha realizado la accion saltar " + saltos + " veces");
    }
}
