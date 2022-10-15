package questao3;

public class Main {
    public static void main(String[] args) {
        Forms forms = new Forms();
        App app = new App(forms);
        app.login();
        
        Google google = new Google();
        app.setLogin(google);
        app.login();
    }
}
