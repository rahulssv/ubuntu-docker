import java.net.*;

public class Container1App {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] sendData = "Hello from Container 1".getBytes();
        InetAddress receiverAddress = InetAddress.getByName("container2");

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receiverAddress, 9876);
        socket.send(sendPacket);
        socket.close();
    }
}
