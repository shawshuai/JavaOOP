package chap7.example.ex4;

import java.util.Arrays;

public class StringStringBuilderDemo {

	public static void main(String[] args) {
		String s = "";
		StringBuilder builder5 = new StringBuilder(s);	//��װΪStringBuilder����
		builder5.append("This ").append("is ").append("a ").append("good ").append("idea!");  //����append()���ƴ�ӵ�Ч��
		s = builder5.toString();	//ת��ΪString����
		String[] words = s.split(" ");  //����String��Ľ����������ַ����ÿո�ֽ�Ϊ ���ɸ�����
		System.out.println(Arrays.toString(words));  //�������,����[This, is, a, good, idea!]

	}

}
