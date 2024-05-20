package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null; //클라이언트 소켓 선언
		
		BufferedReader in = null; //입력: 클라이언트에서 들어오는 데이터
		BufferedWriter out = null; //출력: 클라이언트로 보내는 데이터
		
		Scanner sc = new Scanner(System.in);
		
		try {
			//서버 ip와 포트를 가지고 소켓객체 생성
			//소켓 객체로 데이터를 주고 받음
			socket = new Socket("localhost", 9999);
			//입력: 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력: 클라이언트에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine(); //클라이언트에서 보내는 매시지
				if(outputMessage.equals("bye")) {
					out.write(outputMessage + "\n"); //서버로 메시지 보내기
					out.flush(); //비정상적 종료시, 메시지 재전송
					break;
				}
				out.write(outputMessage+"\n"); //서버로 메시지 보내기
				out.flush(); //비정상적 종료시, 메시지 재전송
				
				String inputMessage = in.readLine(); //한행의 문자열을 읽음
				System.out.println("서버: " + inputMessage); //서버에서 온 메시지
			}
		} catch (Exception e) {
			e.printStackTrace(); //예외처리시 자동으로 출력되는 메시지
		} finally {
			try {
				sc.close();
				socket.close();
			} catch (Exception e2) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
