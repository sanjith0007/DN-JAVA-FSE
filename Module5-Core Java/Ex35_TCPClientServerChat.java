//Server side
import java.io.*;
import java.net.*;

class TCPServer {

    public static void main(String[] args)
            throws Exception {

        ServerSocket serverObj =
                new ServerSocket(5000);

        Socket clientObj =
                serverObj.accept();

        BufferedReader receiveBox =
                new BufferedReader(
                        new InputStreamReader(
                                clientObj.getInputStream()));

        PrintWriter sendBox =
                new PrintWriter(
                        clientObj.getOutputStream(),
                        true);

        String clientMsg =
                receiveBox.readLine();

        System.out.println(
                "Client: " + clientMsg);

        sendBox.println(
                "Hello Client");

        clientObj.close();

        serverObj.close();
    }

//Client Side

class TCPClient {

    public static void main(String[] args)
            throws Exception {

        Socket socketObj =
                new Socket("localhost",5000);

        PrintWriter sendBox =
                new PrintWriter(
                        socketObj.getOutputStream(),
                        true);

        BufferedReader receiveBox =
                new BufferedReader(
                        new InputStreamReader(
                                socketObj.getInputStream()));

        sendBox.println(
                "Hello Server");

        System.out.println(
                "Server: " +
                receiveBox.readLine());

        socketObj.close();
    }
}

/*
Server Output:
Client: Hello Server

Client Output:
Server: Hello Client
*/

}

