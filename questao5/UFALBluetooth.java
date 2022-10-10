package questao5;

public abstract class UFALBluetooth { 
    void abrirConexao() {
        System.out.println("Abrindo conexão");
    }

    abstract void processarDados();

    void fecharConexao() {
        System.out.println("Fechando conexão");
    }
}
