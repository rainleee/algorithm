package hashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hash02PhoneBook {
	

	    public boolean solution(String[] phone_book) {
	        //맵문제다. map의 value를 value.langth만큼 같다면(.equals) false, 없다면 true
	        //무조건 phone_book의 1번째 인자값이 접두어인경우에 해당
	        boolean answer = true;
	        Arrays.sort(phone_book); // 솔루션 함수에 넣으세요
	        for(int i = 0; i <= phone_book.length-1; i ++){
	            System.out.println("arrat : " + phone_book[i]);    
	        }
	        
	        
	        Map<String,String> map = new HashMap<String,String>();
	        
	        //키= 벨류를 맵핑함
	        for(String number : phone_book){
	            map.put(number, map.getOrDefault(number, number));
	            //0번째 인자값과 내용이 같지 않다면
	            if(!(map.get(number).equals(phone_book[0]))){
	                //저장된 value값이 0번째 인자값과 같은지 나타내는 함수 startsWith
	                if( map.get(number).startsWith(phone_book[0]) ){
	                    answer = false;    
	                    //확인용
	                    //System.out.println(map.get(number).startsWith(phone_book[0]));
	                    //answer값 확인용 sysout
	                    //System.out.println(answer);
	                }
	                
	                //System.out.println("if문 : " + map.get(number));
	            }
	        }// end of for
	        return answer;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map = new HashMap<String, String>();
		
		String[] text = {"12", "123", "443"};
		String[] text1 = {"98", "123", "443"};
		
		Arrays.sort(text);
		Arrays.sort(text1);
		for (int i = 0; i <=text.length -1; i++) {
			System.out.print("text : " + text[i] + " ");
			
		}
		System.out.println();
		for (int i = 0; i <=text1.length -1; i++) {
			System.out.print("text1 : " + text1[i] + " ");
			
		}

	}

}


