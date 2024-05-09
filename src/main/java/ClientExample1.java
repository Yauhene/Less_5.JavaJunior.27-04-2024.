import java.io.*;
import java.net.*;

public class ClientExample1 {
    public static void main(String[] args) {
        new Socket();
        try {
            InetAddress address = InetAddress.getLocalHost();
//            System.out.println(address);
            Socket client = new Socket(address, 1300);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
