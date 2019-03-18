import java.util.Arrays;
import java.util.Scanner;

public class StuScrSystem {
    final static int STUDENT_NUM = 6;
    final static int COURSE_NUM = 5;

    static String[] students = {"zhang","wang","li","zhao","liu","song"};
    static String[] courses = {"C","Java","mySQL","Linux","HTML"};
    static double[][] score = new double[STUDENT_NUM][COURSE_NUM];
    

    public static void main(String[] args) {
        InitScore();
        run(students, courses, score);
    }

    // ��ʼ������ʾѧ���ĳɼ�
    public static void InitScore() {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < courses.length; j++) {
                score[i][j] = Math.random() * 60 + 40;
            }
        }
        System.out.print("\t");
        for (int k=0;k<courses.length;k++) {
            System.out.print(courses[k] + "\t");
        }
        System.out.println("");
        for (int m=0;m<students.length;m++) {
            System.out.print(students[m] + "\t");
            for (int n=0;n<courses.length;n++) {
                System.out.printf("%.2f\t",score[m][n]);                
            }
            System.out.println("");
        }
    }

    public static void run(String[] students, String[] courses, double[][] score) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.print("���������");
            String command = scn.next();

            if (command.equalsIgnoreCase("avg")) {
                String parameter = scn.next();
                avg(students, courses, score, parameter);
            }
            if (command.equalsIgnoreCase("get")) {
                String parameter1 = scn.next();
                String parameter2 = scn.next();
                get(students, courses, score, parameter1, parameter2);
            }
            if (command.equalsIgnoreCase("sort")) {
                String parameter = scn.next();
                sortByScore(students, courses, score, parameter);
            }
            if (command.equalsIgnoreCase("max")) {
                String parameter = scn.next();
                getMax(students, courses, score, parameter);
            }
            if (command.equalsIgnoreCase("exit")) {
                System.out.println("�˳���ѯϵͳ����л����ʹ�ã�");
                System.exit(0);
            }
        }
    }

    public static void get(String[] students, String[] courses, double[][] score, String condition1,
            String condition2) {
        int i_index = -1, j_index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(condition1)) {
                i_index = i;
            }
        }
        if (i_index != -1) {
            for (int j = 0; j < courses.length; j++)
                if (courses[j].equalsIgnoreCase(condition2)) {
                    j_index = j;
                }
        } else {
            System.out.println("û��" + condition1 + "�����");
            return;
        }
        if (j_index != -1) {
            System.out.println(condition1 + "��" + condition2 + "�ĳɼ���" + score[i_index][j_index]);
        } else {
            System.out.println(condition1 + "û��" + condition2 + "���ſγ�");
            return;
        }
    }

    public static void avg(String[] student, String[] course, double[][] score, String parameter) {
        int stu_index = -1, cour_index = -1;
        double sum=0,avgS=0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(parameter)) {
                stu_index = i;
            }
        }
        if (stu_index == -1) {
            for (int j=0; j < courses.length; j++) {
                if (courses[j].equalsIgnoreCase(parameter)) {
                    cour_index = j;
                }
            }
        }
        if (stu_index != -1 && cour_index == -1) {
            for (int a=0;a<courses.length;a++) {
                sum += score[stu_index][a];
            }
            avgS = sum / courses.length;
            System.out.println(parameter + "��ƽ���ɼ���" + avgS);
        } else if (cour_index != -1 && stu_index == -1) {
            for (int b=0;b<students.length;b++ ) {
                sum += score[b][cour_index];
            }
            avgS = sum / students.length;
            System.out.println(parameter + "��ƽ���ɼ���" + avgS);
        } else {
            System.out.println("������ļȲ���ѧ��Ҳ���ǿγ�");
        }
    }

    public static void sortByScore(String[] student, String[] course, double[][] score, String parameter) {
        int stu_index = -1, cour_index = -1;
        String cour_tem,stu_tem;
        double score_tem;
        int max_index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(parameter)) {
                stu_index = i;
            }
        }
        if (stu_index == -1) {
            for (int j=0; j < courses.length; j++) {
                if (courses[j].equalsIgnoreCase(parameter)) {
                    cour_index = j;
                }
            }
        }
    }

    public static void getMax(String[] student, String[] course, double[][] score, String parameter) {
        int stu_index = -1, cour_index = -1, cour_num = 0, stu_num = 0;
        double maxS = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(parameter)) {
                stu_index = i;
            }
        }
        if (stu_index == -1) {
            for (int j=0; j < courses.length; j++) {
                if (courses[j].equalsIgnoreCase(parameter)) {
                    cour_index = j;
                }
            }
        }
        if (stu_index != -1 && cour_index == -1) {
            int i = 0;
            for (i=0;i<courses.length;i++) {
                if (score[stu_index][i] > maxS) {
                    maxS = score[stu_index][i];
                    cour_num = i;
                }
            }
            System.out.printf("%s��%s�γ̷�����ߣ�%.2f\n",students[stu_index],courses[cour_num],score[stu_index][cour_num]);
        } else if (cour_index != -1 && stu_index == -1) {
            int j = 0;
            for (j=0;j<students.length;j++) {
                if (score[j][cour_index] > maxS) {
                    maxS = score[j][cour_index];
                    stu_num = j;
                }
            }
            System.out.printf("%s��%s�γ̷�����ߣ�%.2f\n",students[stu_num],courses[cour_index],score[stu_num][cour_index]);
        } else {
            System.out.println("������ļȲ���ѧ��Ҳ���ǿγ�");
        }
    }
}