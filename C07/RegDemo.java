package chap7.example;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo {


	public static void main(String[] args) {
		String str="123a-3b456c0d7x89";
		Pattern reg = Pattern.compile("\\d+");
		Matcher m= reg.matcher(str);
		String[] a= new String[10];
		int i=0;
		while(m.find()){
			a[i++]=m.group();
		}
		System.out.println(Arrays.toString(a));

		
		String str2="abzycaadecaab?ca+abcadddc";
		Pattern reg2 = Pattern.compile("a[a-z]{3}c");
		Matcher m2= reg2.matcher(str2);
		String[] a2= new String[10];
		int i2=0;
		while(m2.find()){
			a2[i2++]=m2.group();
		}
		System.out.println(Arrays.toString(a2));

		
		String email="song.yan@gc.ustb.edu.cn";
		System.out.println(email.matches("[a-zA-Z0-9_+\\.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}"));
		
		
		String text="aa\tbb\ncc  dd eeff";
		System.out.println(text);
		System.out.println(text.replaceAll("\\s+",""));  //Êä³ö"aabbccddeeff"
		
		String reg3="\\s+";
		String[] res = text.split(reg3);  //
		System.out.println(Arrays.toString(res));  //Êä³ö[aa, bb, cc, dd, eeff]
		
	}

}
