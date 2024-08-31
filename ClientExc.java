import java.io.*;
import java.net.*;
public class ClientExc {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello");
            dos.flush();
            s.close();
        } catch (Exception e){
            System.out.println(e);
        }
}
}
