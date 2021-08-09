package servers;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.net.ServerSocket;

public class ChatServer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        ChatServerManager tcsm = new ChatServerManager();
 
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("서버를 시작합니다");
            while (true) {
                Socket socket = serverSocket.accept(); // 클라이언트 연결요청 대기(연결요청 오기전엔 멈춤)
                // -> 연결요청오면? 소켓을 반환
                // 멀티 클라이언트 -> 소켓이 여러개 -> 리스트로 관리
                // -> 서버 매니져 클래스로 관리
                
                System.out.println(socket.getRemoteSocketAddress() + " : 연결");
                tcsm.addSocket(socket); // 얻은 소켓 서버매니져의 소켓목록에 추가
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}
