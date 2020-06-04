
public class Recursion_Test {
	
	public static int Function(int num) {
		
		if (num == 1) {
			return 1;
		}else {
			// num이 1이 아니라면 Recursio(재귀한다.) 나 스스로를 다시 호출.
			return num + Function(num-1);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("1부터 5까지의 합은 : " + Function(4));
	}

}
