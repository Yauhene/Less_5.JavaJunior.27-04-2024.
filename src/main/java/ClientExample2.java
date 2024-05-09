import java.io.*;
import java.net.*;

public class ClientExample2 {
    public static void main(String[] args) {
        new Socket();
        try {
            InetAddress address = InetAddress.getLocalHost();
            Socket client = new Socket(address, 1300);

            System.out.println(client.getInetAddress());
            System.out.println(client.getLocalPort());

            InputStream inStream = client.getInputStream();
            OutputStream outStream = client.getOutputStream();
            // DataInputStream - чтение из потока любых типов примитивных данных, массивов и строк
            DataInputStream dataInputStream = new DataInputStream(inStream);
            PrintStream printStream = new PrintStream(outStream);

            printStream.println("Привет!");
            System.out.println(dataInputStream.readLine());
            client.close();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
