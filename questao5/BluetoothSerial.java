package questao5;

class BluetoothSerial extends UFALBluetooth {
    @Override
    void processData() {
        System.out.println("Processando os dados por comunicação serial");
    }
}