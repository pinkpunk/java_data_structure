package java_train;

import java.util.ArrayList;
import java.util.Scanner;

public class gkggkkldk {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String munja =""; 
		//대문자 알파벳만 입력받는다. 어길 시, 종료.
		outbreak:for(;;) {
			char atr =sc.next().charAt(0);    //'char'타입으로 값을 입력받는다.
			if((int)atr >=65 &&(int)atr<=90) {
				munja+=atr;                   //String타입의 변수에 문자를 추가한다.
			}
			else
				break outbreak;
		}
	//내림차순으로 정렬하기
		byte min =0;
		byte[] barr =munja.getBytes();
		for(int i=0;i<munja.length();i++) {
			for(int j=i;j<munja.length();j++) {
				if(barr[i] > barr[j]) {
					min =barr[j];
					barr[j] = barr[i];
					barr[i] =min;
				}
			}
		}
	//첫번째 그릇 만들기. 
		ArrayList<Character> first =new ArrayList<>(); 
		for(int i=0;i<barr.length;i++) {
			first.add((char)barr[i]);   //munja.charAt()은 String타입의 munja를 char타입으로 바뀌어서 문자가 호출된다.
		}
	//두번째 그릇 만들기. 중복된 문자 제거.
		ArrayList<Character> sec =new ArrayList<>();
		for(int i=0; i<first.size();i++) {
			if(sec.contains(first.get(i))==false) {
				sec.add(first.get(i));
			}
		}
		
	//마지막 그릇 만들기.
		int count =0;
		int[] counter =new int[sec.size()];
		for(int i=0; i<sec.size();i++) {
			for(int j=0;j<first.size();j++) {
				if(sec.get(i)==first.get(j)) {
					count+=1;
					counter[i]=count;
				}
			}count=0;
		}
	//출력.
		for(int i=0;i<sec.size();i++) {
			System.out.print(sec.get(i)+" : "+counter[i]+"\n");
		}
	}
}
