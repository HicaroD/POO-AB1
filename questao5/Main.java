package questao5;

public class Main {
    public static void main(String[] args) {
        UFALBluetooth bluetooth = new BluetoothPackageBased();
        bluetooth.abrirConexao();
        bluetooth.processarDados();
        bluetooth.fecharConexao();
        System.out.println();
        bluetooth = new BluetoothSerial();
        bluetooth.abrirConexao();
        bluetooth.processarDados();
        bluetooth.fecharConexao();
    } 
}
