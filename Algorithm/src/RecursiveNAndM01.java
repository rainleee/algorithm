import java.util.Scanner;

public class RecursiveNAndM01 {
	//fidle
	//입력값을 나타내줄 n과 m
	static int n;
	static int m;
	//실제 값이 들어가는 int변수.
	static int num[];
	// check == 1 이미 한번 방문한 번호, 중복체크해서 비효율적인 메모리 사용을 방지한다.
	static int check[];
	
	//Constructor
	public RecursiveNAndM01(){
	}
	
	//Method
	public static void dfs(int count) { 
		
		//재귀함수의 무한반복을 막기위해서 존재하는 로직.
		if (count == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(num[i] + " ");
			}
			//한칸 내리는 용
			System.out.println("");
			return;
		}
		
	 for(int i =1; i <=n; i++) {
		 
		 //이미 방문한 곳이라면.
		 if (check[i] == 1) {
			 continue;
		}
		 //이미num에서 값을 저장했다면.중복체크.
		 check[i] = 1;
		 //count = 0 ==> num[0] = 1부터 저장한다.
		 num[count] = i;
		//재귀함수로서 다시 호출.
		 dfs(count + 1);
		 check[i] = 0;
		 
		 
	 }//end of for
	 
	}
	
	//MainMethod
	public static void main(String[] args) {
		
		//입력을 담당해줄 inputStream을 변수로 받는 Scanner 선언  
		Scanner sc = new Scanner(System.in);
		
		//입력값을 받아줄 satatic변수 재정
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		check = new int[9];
		num = new int[9];
		//변수는 0으로 처리해서 0번쨰 index부터 정보가 저장되게 구성.
		dfs(0);

	}

}
