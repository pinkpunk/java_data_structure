package java_train;

import java.util.ArrayList;
import java.util.Scanner;

public class gkggkkldk {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String munja =""; 
		//�빮�� ���ĺ��� �Է¹޴´�. ��� ��, ����.
		outbreak:for(;;) {
			char atr =sc.next().charAt(0);    //'char'Ÿ������ ���� �Է¹޴´�.
			if((int)atr >=65 &&(int)atr<=90) {
				munja+=atr;                   //StringŸ���� ������ ���ڸ� �߰��Ѵ�.
			}
			else
				break outbreak;
		}
	//������������ �����ϱ�
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
	//ù��° �׸� �����. 
		ArrayList<Character> first =new ArrayList<>(); 
		for(int i=0;i<barr.length;i++) {
			first.add((char)barr[i]);   //munja.charAt()�� StringŸ���� munja�� charŸ������ �ٲ� ���ڰ� ȣ��ȴ�.
		}
	//�ι�° �׸� �����. �ߺ��� ���� ����.
		ArrayList<Character> sec =new ArrayList<>();
		for(int i=0; i<first.size();i++) {
			if(sec.contains(first.get(i))==false) {
				sec.add(first.get(i));
			}
		}
		
	//������ �׸� �����.
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
	//���.
		for(int i=0;i<sec.size();i++) {
			System.out.print(sec.get(i)+" : "+counter[i]+"\n");
		}
	}
}
