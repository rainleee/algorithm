
public class ClapGame {

	public static void main(String[] args) {
		// 369박수 게임을 구현해보자.
		// 3-6-9일땐, 짝을 출력해야 하며, 짝짝짝이 나올 경우는 게임을 종료한다. 끝나는 숫자는 없기에 100으로 제한한다.
		for (int cnt = 1; cnt <= 100; cnt++) {
			String strCnt = String.valueOf(cnt); // 문자열 변환
			boolean isChark = false; // 3 6 9 해당여부 저장
			for (int i = 0; i < strCnt.length(); i++) {
				char chk = strCnt.charAt(i);
				//System.out.println("charAt : [" + i + "] : " + chk);
				// 해당 수의 앞에서부터 i번째 숫자부터 검사
				if (chk == '3' || chk == '6' || chk == '9') {
					// 3 6 9 해당되면 짝 출력
					System.out.print('짝');
					isChark = true;
				}
			}
			if (!isChark) {
				// 3 6 9 해당 되지 않았다면 수 표시
				System.out.print(strCnt);
			}
			//chk가 아니라 cnt
			if (cnt % 10 == 0) {
				// 10 단위로 줄바꿈 10 20 30 40 50 60일때 한칸내려서 정보를 표기.
				System.out.println();
			} else {
				// 중간수면 한 칸 띄우기
				System.out.print(' ');
			}
		}

	}
}
