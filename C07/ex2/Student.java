package chap7.example.ex2;

public class Student {
	private String name;
	private int age;
	
	private static Student[] pool;
	private static int count;

	static{
		pool = new Student[100];
		count=0;		
	}
	
	public static Student getStudent(String name, int age){
        for(int i=0; i<count; i++){   //在对象池中查找
             if (pool[i].name.equals(name) && pool[i].age==age){
                return  pool[i];	//返回引用地址
            }
        }
        
        //对象池中不存在该对象的情况下，创建新的对象、放入对象池
        Student stu=new Student(name,age);
        pool[count]=stu;
        count++;   //如果已满，可以进行扩容处理
        return stu; 
	}

	public static void main(String[] args) {		
		Student stu1 = new Student("zhang",20);	//创建新对象，不放入对象池		
		Student stu2 = Student.getStudent("zhang",20);	//该对象在对象池中不存在，创建，并保存至对象池	
		Student stu3 = Student.getStudent("zhang", 20);	//对象池已存在该对象，直接从对象池获取	
		
		System.out.println(stu2==stu1);	//false
		System.out.println(stu2==stu3);	//true
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
