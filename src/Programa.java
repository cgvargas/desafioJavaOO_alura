import br.com.t6onealura.models.ModeloCarro;
import java.util.Scanner;

/**
 * Classe principal do programa.
 */
public class Programa {
    /**
     * Método principal do programa.
     * @param args Os argumentos de sing de comando.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ModeloCarro meuCarro = ModeloCarro.criarModeloCarro(sc);

        System.out.println(meuCarro);

        sc.close();
    }
}