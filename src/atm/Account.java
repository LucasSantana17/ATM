package atm;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private List<Usuario> conta = new ArrayList<>();


    public void add(String nome, int pin) {
        Usuario user = new Usuario(nome, pin);
        conta.add(user);
    }

    public void mostrarLista() {
        for (Usuario user : conta) {
            System.out.println("Nome: " + user.getNomeUser() + ", PIN: " + user.getPIN());
        }
    }
}
