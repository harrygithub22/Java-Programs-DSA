import java.io.*;
import java.net.*;

public class ServerExc {

  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(6666);
      System.out.println("waiting for client");
      Socket s = ss.accept();
      DataInputStream dis = new DataInputStream(s.getInputStream());
      String str = dis.readUTF();
      System.out.println("Message" + str);
      ss.close();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e);
    }
  }
}
