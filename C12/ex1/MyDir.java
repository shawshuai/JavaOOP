package chap12.example.ex1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDir {	

	public static void main(String[] args) {
		MyDir md = new MyDir();
		Scanner scn = new Scanner(System.in);
		System.out.print("����ָ�");		
		String[] command = scn.nextLine().trim().split("\\s+"); 
		
		if(command[0].equalsIgnoreCase("dir")){
			if(command.length>1){ //ָ��·��
				md.dir(command[1]);
			}else{
				md.dir(".");  //Ĭ��Ϊ��ǰĿ¼
			}
		}else{
			System.out.print("������dirָ��.");
		}
	}
	
	public void dir(String arg){
		File nowDir = new File(arg);  //����File����
		if(!nowDir.isDirectory() ){
			System.out.println("������Ч��Ŀ¼��");
			System.exit(0);
		}
		File[] subDir = nowDir.listFiles();  //Ŀ¼�µ������ļ���Ŀ¼
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		for(int i=0; i<subDir.length; i++){
			System.out.print( sdf.format(new Date(subDir[i].lastModified())) +"\t");
			if (subDir[i].isDirectory()){ //�ļ���
				System.out.print("<DIR>\t\t");
			}else{ //�ļ�
				System.out.print("\t"+subDir[i].length()+"\t");
			}
			
			System.out.println(subDir[i].getName());
			
		}	
	}
}
