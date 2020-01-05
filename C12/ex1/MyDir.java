package chap12.example.ex1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDir {	

	public static void main(String[] args) {
		MyDir md = new MyDir();
		Scanner scn = new Scanner(System.in);
		System.out.print("输入指令：");		
		String[] command = scn.nextLine().trim().split("\\s+"); 
		
		if(command[0].equalsIgnoreCase("dir")){
			if(command.length>1){ //指定路径
				md.dir(command[1]);
			}else{
				md.dir(".");  //默认为当前目录
			}
		}else{
			System.out.print("请输入dir指令.");
		}
	}
	
	public void dir(String arg){
		File nowDir = new File(arg);  //创建File对象
		if(!nowDir.isDirectory() ){
			System.out.println("不是有效的目录名");
			System.exit(0);
		}
		File[] subDir = nowDir.listFiles();  //目录下的所有文件及目录
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		for(int i=0; i<subDir.length; i++){
			System.out.print( sdf.format(new Date(subDir[i].lastModified())) +"\t");
			if (subDir[i].isDirectory()){ //文件夹
				System.out.print("<DIR>\t\t");
			}else{ //文件
				System.out.print("\t"+subDir[i].length()+"\t");
			}
			
			System.out.println(subDir[i].getName());
			
		}	
	}
}
