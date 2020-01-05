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
        for(int i=0; i<count; i++){   //�ڶ�����в���
             if (pool[i].name.equals(name) && pool[i].age==age){
                return  pool[i];	//�������õ�ַ
            }
        }
        
        //������в����ڸö��������£������µĶ��󡢷�������
        Student stu=new Student(name,age);
        pool[count]=stu;
        count++;   //������������Խ������ݴ���
        return stu; 
	}

	public static void main(String[] args) {		
		Student stu1 = new Student("zhang",20);	//�����¶��󣬲���������		
		Student stu2 = Student.getStudent("zhang",20);	//�ö����ڶ�����в����ڣ��������������������	
		Student stu3 = Student.getStudent("zhang", 20);	//������Ѵ��ڸö���ֱ�ӴӶ���ػ�ȡ	
		
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
