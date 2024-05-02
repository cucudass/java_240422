package chapter03;

/*
 * 4년 전체 평점(평균 학점)의 평균 구하기
 * 2차원 배열 이용해서 원소로 초기화
 * 1행1열부터 4행2열까지
 * length 필드 이용 
 * */

public class Ex3_10 {
	public static void main(String[] args) {
		double sum = 0;
		//4행 2열
		//만점 기준 4.5
		double score[][] = {{3.3, 3.4}, //1행 1학년 1/2
							{3.5, 3.6}, //2행 2학년 1/2
							{3.7, 4.0}, //3행 3학년 1/2
							{4.1, 4.2}};//4행 4학년 1/2
		
		for (int i = 0; i < score.length; i++) { //행의 크기
			for (int j = 0; j < score[i].length; j++) { //열의 크기
				sum += score[i][j];
			}
		}
		
		int n = score.length; //행의 크기
		int m = score[0].length; //열의 크기
		
		System.out.println("4년 전체의 평점 평균은 " + sum/(n*m));
	}
}
