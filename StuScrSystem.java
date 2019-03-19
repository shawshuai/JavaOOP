import java.util.Arrays;
import java.util.Scanner;

public class StuScrSystem {
    final static int STUDENT_NUM = 6;
    final static int COURSE_NUM = 5;

    static String[] students = {"zhang","wang","li","zhao","liu","song"};
    static String[] courses = {"C","Java","mySQL","Linux","HTML"};
    static double[] stuScoreAve = new double[students.length];
    static double[] courScoreAve = new double[courses.length];
    static double[][] score = new double[STUDENT_NUM][COURSE_NUM];
    

    public static void main(String[] args) {
        InitScore();
        run(students, courses, score);
    }

    //初始化并显示学生的成绩
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
            System.out.print("请输入命令:");
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
                System.out.println("退出查询系统。感谢您的使用！");
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
            System.out.println("没有" + condition1 + "这个人");
            return;
        }
        if (j_index != -1) {
            System.out.println(condition1 + "的" + condition2 + "课程成绩是" + score[i_index][j_index]);
        } else {
            System.out.println(condition1 + "没有" + condition2 + "这门课程");
            return;
        }
    }

    public static void avg(String[] student, String[] course, double[][] score, String parameter) {
        int stu_index = -1, cour_index = -1, index = -1;
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
        if (stu_index == -1 & cour_index == -1) {
            if (parameter.equalsIgnoreCase("all")) {
                index = 1;
            }

        }
        if (stu_index != -1 && cour_index == -1) {
            for (int a=0;a<courses.length;a++) {
                sum += score[stu_index][a];
            }
            avgS = sum / courses.length;
            System.out.println(parameter + "的平均成绩是" + avgS);
        } else if (cour_index != -1 && stu_index == -1) {
            for (int b=0;b<students.length;b++ ) {
                sum += score[b][cour_index];
            }
            avgS = sum / students.length;
            System.out.println(parameter + "的平均成绩是" + avgS);
        } else if (index != -1 && stu_index == -1 && cour_index == -1) {
            for (int c=0;c<student.length;c++) {
                for (int d=0;d<course.length;d++) {
                    sum += score[c][d];
                }
                stuScoreAve[c] = sum / course.length;
                sum = 0;
            }
            for (int e=0;e<course.length;e++) {
                for (int f=0;f<student.length;f++) {
                    sum += score[f][e];
                }
                courScoreAve[e] = sum / student.length;
                sum = 0;
            }
            System.out.print("\t");
            for (int g=0;g<course.length;g++) {
                System.out.printf("%s\t",course[g]);
            }
            System.out.println("");
            for (int h=0;h<student.length;h++) {
                System.out.printf("%s\t",student[h]);
                for (int i=0;i<course.length;i++) {
                    System.out.printf("%.2f\t",score[h][i]);
                }
                System.out.printf("%.2f\n",stuScoreAve[h]);
            }
            System.out.print("\t");
            for (int j=0;j<course.length;j++) {
                System.out.printf("%.2f\t",courScoreAve[j]);
            }
            System.out.println("");
        } else {
             System.out.println("你输入的既不是学生名也不是课程名");
        }
    }

    public static void sortByScore(String[] student, String[] course, double[][] score, String parameter) {
        int stu_index = -1, cour_index = -1;
        String cour_tem,stu_tem;
        String[] course_tem = {"C","Java","mySQL","Linux","HTML"};
        String[] students_tem = {"zhang","wang","li","zhao","liu","song"};
        double score_tem,maxS;
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
        if (stu_index != -1 && cour_index == -1) {
            for (int i = 0; i < courses.length; i++) {
                // 初始化未排序序列中最小数据数组下标
                max_index= i;
                for (int j = i+1; j < courses.length; j++) {
                    // 在未排序元素中继续寻找最小元素，并保存其下标
                    if (score[stu_index][j] > score[stu_index][max_index]) {
                        max_index = j;
                    }
                }
                // 将未排序列中最小元素放到已排序列末尾
                if (max_index != i) {
                    score_tem = score[stu_index][max_index];
                    score[stu_index][max_index] = score[stu_index][i];
                    score[stu_index][i] = score_tem;
                    cour_tem = course_tem[max_index];
                    course_tem[max_index] = course_tem[i];
                    course_tem[i] = cour_tem;
                }
            }
            System.out.print("排名\t课程\t成绩\n");
            for (int x=0;x<courses.length;x++) {
                System.out.printf("%s\t",x+1);
                System.out.printf("%s\t",course_tem[x]);
                System.out.printf("%.2f\n",score[stu_index][x]);
            }   
        } else if (cour_index != -1 && stu_index == -1) {
            for (int i = 0;i < student.length; i++) {
                max_index = i;
                for (int j = i+1; j <student.length; j++) {
                    if (score[j][cour_index] > score[max_index][cour_index] ) {
                        max_index = j;
                    }
                }
                if (max_index != i) {
                    score_tem = score[max_index][cour_index];
                    score[max_index][cour_index] = score[i][cour_index];
                    score[i][cour_index] = score_tem;
                    stu_tem = students_tem[max_index];
                    students_tem[max_index] = students_tem[i];
                    students_tem[i] = stu_tem;
                }
            }
            System.out.print("排名\t姓名\t成绩\n");
            for (int x=0;x<student.length;x++) {
                System.out.printf("%s\t",x+1);
                System.out.printf("%s\t",students_tem[x]);
                System.out.printf("%.2f\n",score[x][cour_index]);
            }
        } else {
            System.out.println("您输入的既不是课程名称也不是学生姓名！");
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
            System.out.printf("%s同学的%s课程有%.2f的最高分\n",students[stu_index],courses[cour_num],score[stu_index][cour_num]);
        } else if (cour_index != -1 && stu_index == -1) {
            int j = 0;
            for (j=0;j<students.length;j++) {
                if (score[j][cour_index] > maxS) {
                    maxS = score[j][cour_index];
                    stu_num = j;
                }
            }
            System.out.printf("%s同学的%s课程有%.2f的最高分\n",students[stu_num],courses[cour_index],score[stu_num][cour_index]);
        } else {
            System.out.println("你输入的既不是学生名也不是课程名");
        }
    }
}