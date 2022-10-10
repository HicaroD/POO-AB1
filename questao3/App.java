package questao3;

class App {
    private Login login;

    public App(Login login) {
        this.login = login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void logar() {
        login.logar();
    }
}