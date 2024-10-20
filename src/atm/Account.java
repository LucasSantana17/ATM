package atm;

import java.util.ArrayList;
import java.util.List;

public class Account {

    // Lista de usuários
    private List<Usuario> users = new ArrayList<>();

    // Método para adicionar um usuário
    public void addUser(Usuario user) {
        this.users.add(user); // Adiciona o usuário recebido
    }

    // Método para listar os usuários
    public void openUsers() {
        for (Usuario user : users) {
            System.out.println(user.getNome()); // Exibe o nome de cada usuário
        }
    }
}
