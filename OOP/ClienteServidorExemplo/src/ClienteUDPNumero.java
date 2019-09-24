import java.net.*;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class ClienteUDPNumero {

  public static void main(String args[]) {
    try {
      DatagramSocket socket = new DatagramSocket();

      InetAddress enderecoServidor = InetAddress.getByName("127.0.0.1");
      int portaServidor = 2654;
      byte[] num = new byte[1];
      num[0] = 12;
      DatagramPacket datagrama = new DatagramPacket (num, 1, enderecoServidor, portaServidor);

      socket.send(datagrama);
      System.out.println("datagrama UDP enviado com sucesso");

    }
    catch (Exception exc) {
      System.err.println(exc.toString());

    }

  }

}
