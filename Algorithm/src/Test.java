import java.util.Arrays;

public class Test{
    public static void main (String[] args) {
    	
    	String[] a = {"f","e","d","c","b","a"};
    	String b[] = {"a","b"};
    	for (int i = 0; i < a.length; i++) {
			System.out.println("a [" + i + "] = " + a[i]);
		}
		Arrays.sort(a);
		System.out.println("=======================");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a [" + i + "] = " + a[i]);
		}
		
    }
}