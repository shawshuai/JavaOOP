/*题目内容：
设计一个表示分数的类Fraction。这个类用两个int类型的变量分别表示分子和分母。
这个类的构造函数是：
Fraction(int a, int b)
构造一个a/b的分数。
这个类要提供以下的功能：
double toDouble();
    将分数转换为double
Fraction plus(Fraction r);
    将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。
Fraction multiply(Fraction r);
    将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
void print();
    将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。

你写的类要和以下的代码放在一起，并请勿修改这个代码：
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}
注意，你的类的定义应该这样开始：
class Fraction {
也就是说，在你的类的class前面不要有public。
输入格式:
程序运行时会得到四个数字，分别构成两个分数，依次是分子和分母。
输出格式：
输出一些算式。这些输入和输出都是由Main类的代码完成的，你的代码不要做输入和输出。
输入样例：
2 4 1 3
输出样例：
1/2
1/3
5/6
1
1/2
1/3
时间限制：500ms内存限制：32000kb*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}

class Fraction{
    int numerator;   //分子
    int denominator;   //分母

    Fraction(int a, int b){
        if (a == b) {
            a = 1;
            b = 1;
        } else if (a > b){
            for (int i=a;i>1;i--){
                if (a%i==0 && b%i==0){
                    a /= i;
                    b /= i;
                }
            }
        } else {
            for (int j=b;j>1;j--){
                if (a%j==0 && b%j==0){
                    a /= j;
                    b /= j;
                }
            }
        }
        this.numerator = a;
        this.denominator = b;
    }

    double toDouble(){
        return this.numerator/this.denominator;
    }

    Fraction plus(Fraction r){
        int res_deno = 0, res_numer = 0;
        if (this.denominator == r.denominator){
            res_numer = this.numerator + r.numerator;
        } else {
            res_deno = this.denominator * r.denominator;
            res_numer = this.numerator*r.denominator + r.numerator*this.denominator;
        }
        Fraction res = new Fraction(res_numer, res_deno);
        return res;
    }

    Fraction multiply(Fraction r){
        int res_deno = 0, res_numer = 0;
        res_deno = this.denominator*r.denominator;
        res_numer = this.numerator*r.numerator;
        Fraction res = new Fraction(res_numer, res_deno);
        return res;
    }

    void print(){
        if (this.numerator == this.denominator){
            System.out.println(1);
        } else {
            System.out.println(this.numerator+"/"+this.denominator);
        }
    }
}