package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket listener = null; //서버 소켓 선언
		Socket socket = null; //클라이언트 소켓 선언
		
		BufferedReader in = null; //입력: 클라이언트에서 들어오는 데이터
		BufferedWriter out = null; //출력: 클라이언트로 보내는 데이터
		
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999); //서버소켓객체 생성
			System.out.println("연결을 기다리고 있습니다.....");
			//소켓 객체로 데이터를 주고 받음
			socket = listener.accept();
			//입력: 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력: 클라이언트에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				String inputMessage = in.readLine(); //한행의 문자열을 읽음
				if(inputMessage.equals("bye")) {
					System.out.println("클라이언트에서 bye 로 연결을 종료하였음.");
					break;
				}
				System.out.println("클라이언트:" + inputMessage); //클라이언트에서 온 메시지
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine(); //서버에서 보내는 매시지
				out.write(outputMessage+"\n"); //클라이언트로 메시지 보내기
				out.flush(); //비정상적 종료시, 메시지 재전송
			}
		} catch (Exception e) {
			e.printStackTrace(); //예외처리시 자동으로 출력되는 메시지
		} finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			} catch (Exception e2) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
