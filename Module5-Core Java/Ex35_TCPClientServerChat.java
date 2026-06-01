import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer {

    public static void main(String[] args)
        throws Exception {

    ServerSocket serverBox =
        new ServerSocket(5000);

    Socket userLink =
        serverBox.accept();

    BufferedReader readBox =
        new BufferedReader(
            new InputStreamReader(
                userLink.getInputStream()));

    System.out.println(
        readBox.readLine());

    serverBox.close();
    }
}

class TCPClient {

    public static void main(String[] args)
        throws Exception {

    Socket sendBox =
        new Socket("localhost",5000);

    PrintWriter textOut =
        new PrintWriter(
            sendBox.getOutputStream(),
            true);

    textOut.println("Hello Server");

    sendBox.close();
    }
}