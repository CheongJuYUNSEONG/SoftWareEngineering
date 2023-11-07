package SCpro;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 3334;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("서버가 " + port + " 포트로 대기 중입니다.");

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("클라이언트가 연결됨: " + clientSocket.getInetAddress());

                    try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                         PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                        String inputLine;
                        while ((inputLine = in.readLine()) != null) {
                            System.out.println("받은 데이터: " + inputLine);
                            out.println(inputLine);

                            if (inputLine.equals("#quit#")) {
                                break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("클라이언트 연결이 종료됨");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
