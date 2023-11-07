package SCpro;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int serverPort = 3334;

        try (Socket socket = new Socket(serverAddress, serverPort);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)) ) {

            System.out.println("서버에 연결되었습니다.");

            while (true) {
                System.out.print("메시지를 입력하세요: ");
                String message = userInput.readLine();
                out.println(message);

                if (message.equals("#quit#")) {
                    break;
                }

                String response = in.readLine();
                System.out.println("서버로부터 받은 응답: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
