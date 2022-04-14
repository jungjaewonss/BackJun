import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//문제
		//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
		//입력
		//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt(); //사용자에게 몇번입력할거지받기
		for(int i = 0 ; i < test ; i++) {
			int num = sc.nextInt(); //몇명의 점수를 비교할건지
			int total = 0;  //점수의 총점을담을변수
			int count = 0;  //평균초과의 학생이 몇명인지 카운터하기위한 변수
			ArrayList<Integer> avg = new ArrayList<Integer>();
			for (int e = 0; e < num; e++) {
				avg.add(sc.nextInt());  // 반복문을돌면서 ArrayList에 사용자가입력한값을 넣어주기
				total += avg.get(e);   //  입력할때마다 total 에 더해주기
			}

			double avgss = total / (double)num; //  평균구하기 (총점수 / 인원수) 

			for (int j = 0; j < avg.size(); j++) {
				if (avg.get(j) > avgss) {      //반복문을돌면서 평균이상사람이있을때마다 count를 올려주기
					count++;                   // 즉 count의 수는 평균이상의 사람이 몇명인지를 나타낸다.
				}

			}
	                                            
			System.out.printf("%.3f%%" , (double) ((count/(double)num) * 100)); //평균이상인수/전체수  * 100 = 평균이상인사람이 몇퍼센트인지 
			System.out.println(); // 출력시 줄바꿈기능
		}
		

	}
}
