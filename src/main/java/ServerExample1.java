import java.io.*;
import java.net.*;

public class ServerExample1 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1300);
            Socket socket = serverSocket.accept(); // начинаем слушать порт

            OutputStream outStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outStream);
            printStream.println("Hello!");

            socket.close();
            serverSocket.close();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
