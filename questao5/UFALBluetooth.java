package questao5;

public abstract class UFALBluetooth { 
    void openConnection() {
        System.out.println("Abrindo conexão");
    }

    abstract void processData();

    void closeConnection() {
        System.out.println("Fechando conexão");
    }
}
