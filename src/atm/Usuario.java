package atm;

public class Usuario {
    private String nomeUser;
    private int PIN;

    Usuario(){

    }
    public Usuario(String nomeUser, int PIN){
        this.nomeUser = nomeUser;
        this.PIN = PIN;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getPIN() {
        return PIN;
    }




}
