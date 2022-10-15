package questao5;

public class Main {
    public static void main(String[] args) {
        UFALBluetooth bluetooth = new BluetoothPackageBased();
        bluetooth.openConnection();
        bluetooth.processData();
        bluetooth.closeConnection();
        System.out.println();
        bluetooth = new BluetoothSerial();
        bluetooth.openConnection();
        bluetooth.processData();
        bluetooth.closeConnection();
    } 
}
