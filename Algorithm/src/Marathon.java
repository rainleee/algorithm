import java.util.HashMap;
import java.util.Map;

public class Marathon {
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		//key = value를 담을 변수선언. 
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String player : participant) {
			//getOrDefault = key가 있으면 해당키를 반환해 없다면 기본값을 반환. 여기서 기본값은 0.
			//여기선 put 해준 값이 없어서 디폴트값인 0+1이 반환됨 
			map.put(player, map.getOrDefault(player, 0) + 1);
			System.out.println("player : " + map.get(player));
		}
		System.out.println("player : " + map.keySet());
		
		for (String player : completion) {
			//default로 세팅된값 (1)이 존재하는 애들은 -1로해서 0으로 다시 가져옴. 중복체크를 위해 이렇게 한거같음.
			// 이름이 두개이면 혼자만 0이 아니고 다른 값이니까. 
			map.put(player, map.get(player) - 1);
			System.out.println("completion : " + map.get(player));
		
		}
		System.out.println("player : " + map.keySet());
		
		//keySet은 해당변수에 set된 key을 보여줌.
		//System.out.println(map.keySet());
		String result = map.keySet().toString();
		
		for (String key : map.keySet()) {
			
			//저장된 value의 값이 0이 아니라
			System.out.println("map.get(key) : " + map.get(key));
			if (map.get(key) != 0) {
				answer = key;
			}
			
		}
		
		//System.out.println("미 완수자 : " +answer);
		return answer;
		
	}

	public static void main(String[] args) {
		/* 다중주석 control + conmmand + /
		 * String participant[] = {"leo", "kiki", "eden"}; 
		 * String completion[] = {"kiki", "eden"};
		 * String participant[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
		 * String completion[] = {"josipa", "filipa", "marina", "nikola" };
		 */
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String completion[] = {"stanko", "mislav","mislav"};
		System.out.println(solution(participant, completion));
		

	}

}
