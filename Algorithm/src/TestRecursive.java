import java.util.Scanner;

public class TestRecursive {
	
	static int m; // N과 M을 입력받는다.
	static int n; // N과 M을 입력받는다.
	static int list[];
	static int check[]; // 숫자의 방문여부를 체크 할 방문배열과 결과를 저장 할 배열을 선언
	// check의 값이 1이면 방문한것을 인정. 
	
	static void dfs(int cnt) { // DFS메소드, 반복횟수를 인자로 받는다. 초기 0부터 시작
		
//		m번까지 돌고나서 마무리를 지을 때   
		if(cnt == m) { 
			// 0부터 M번까지 반복했으면 하나의 처리가 완성
		    // 작성한이 생각)개인적인 생각으로는 이부분이 백트래킹에 해당한다고 생각한다.
            // M보다 큰 횟수는 고려하지 않고 배제한다.
			for(int i=0;i<m;i++) { // 현재 결과배열을 출력
				System.out.print(list[i]+" ");
			}
			System.out.println("");
			return; // DFS 종료 
		}
		
		for(int i =1;i<=n;i++) { // 수의 범위는 1부터 N까지이다.
			
			//처음 시작하는 수가 1이라서 이미 방문한 배열이면 건너 뛸 것. 
			if(check[i]==1) {
				continue; // 이미 방문한 배열이면 건너뛴다.
 			}
			check[i]=1;			 // 방문하지 않았다면, 방문처리 // 체크는 1이라는 식별자로 방문했던걸 처리한다.
			//System.out.println("돈다돈다." + i +" check : " + check[i]);
			list[cnt]=i; // 현재 반복횟수에 해당하는 배열에 i값을 넣는다.
			//System.out.println("list : [" + i + "] " + list[cnt]);
			dfs(cnt+1); // 반복횟수를 증가시킨다. 재귀함수를 이용 나를 계속 호출.
			
			//System.out.println("----" + i + "-------");
			check[i]=0; // dfs가 종료 후에는 다시 방문여부를 0으로 초기화한다.
			
		}
		
		
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		n = sc.nextInt(); 
		m = sc.nextInt(); 
		sc.close();
		
		check = new int[9]; // n과 m의 최대범위
		list = new int [9];
		dfs(0);
	}

}
