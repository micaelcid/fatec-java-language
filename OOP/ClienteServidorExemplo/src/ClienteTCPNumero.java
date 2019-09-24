import java.net.*;
import java.io.*;

public class ClienteTCPNumero {

  public static void main (String numero[]) {
    String enderecoServidor = "127.0.0.1";
    int portaServidor = 12258;

    try {
      Socket conexao = new Socket (enderecoServidor, portaServidor);

      DataInputStream entrada = new DataInputStream (conexao.getInputStream());
      System.out.println("Numero recebido: " + entrada.readInt());
    }
    catch (Exception exc)
    {
      System.out.println(exc.toString());
    }
  }
}
