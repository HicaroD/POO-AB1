package questao3;

public class Main {
    public static void main(String[] args) {
        Formulario forms = new Formulario();
        App app = new App(forms);
        app.logar();
        
        Google google = new Google();
        app.setLogin(google);
        app.logar();
    }
}
