
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author nicolas
 */
public class Main {

    public static void main(String[] args) {

        Servico servico = new Servico(1, "barba", 30);

        System.out.println(servico.getValor());

        Cliente cliente = new Cliente(2, "Gabriel", 'M', "7198736481", "Rua Tesla 9456");

        System.out.println(cliente.getNome());

        Usuario usuario = new Usuario(1, "Barbeiro", "senha");

        System.out.println(usuario.getNome());
    }

}
