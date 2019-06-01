## 中国大学幕课MOOC练习题源代码

此文件夹中的源代码是中国大学幕课MOOC上浙江大学翁恺老师“面向对象程序设计——Java语言”课程的测验与作业中的代码。题目如下：

### 1 第一周编程题

**题目内容：**

设计一个表示分数的类Fraction。这个类用两个int类型的变量分别表示分子和分母。

这个类的构造函数是：

`Fraction(int a, int b) `      构造一个a/b的分数。

这个类要提供以下的功能：

`double toDouble();`     将分数转换为double

`Fraction plus(Fraction r);`     将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。

`Fraction multiply(Fraction r);`     将自己的分数和r的分数相乘，产生一个新的Fraction的对象。

`void print();`     将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。

注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。

你写的类要和以下的代码放在一起，并请勿修改这个代码：

> import java.util.Scanner; 
>
> public class Main {
>
> ​	public static void main(String[] args) {
>
> ​		Scanner in = new Scanner(System.in);
>
> ​		Fraction a = new Fraction(in.nextInt(), in.nextInt());
>
> ​		Fraction b = new Fraction(in.nextInt(),in.nextInt());
>
> ​		a.print();
>
> ​		b.print();
>
> ​		a.plus(b).print();
>
> ​		a.multiply(b).plus(new Fraction(5,6)).print();
>
> ​		a.print();
>
> ​		b.print();
>
> ​		in.close();
>
> ​	}
>
> }



注意，你的类的定义应该这样开始：`class Fraction {}` 也就是说，在你的类的class前面不要有public。

**输入格式:**

程序运行时会得到四个数字，分别构成两个分数，依次是分子和分母。

**输出格式：**

输出一些算式。这些输入和输出都是由Main类的代码完成的，你的代码不要做输入和输出。

**输入样例：**

2 4 1 3

**输出样例：**

1/2

1/3

5/6

1

1/2

1/3

时间限制：500ms内存限制：32000kb



### **2 第二周编程题**

这一周的编程题是需要你在课程所给的时钟程序的基础上修改而成。但是我们并不直接给你时钟程序的代码，请根据视频自己输入时钟程序的Display和Clock类的代码，然后来做这个题目。我们需要给时钟程序加上一个表示秒的Display，然后为Clock增加以下public的成员函数：

`public Clock(int hour, int minute, int second);`    用hour, minute和second初始化时间。

`public void tick();`    “嘀嗒”一下，时间走1秒。

`public String toString();`    返回一个String的值，以“hh:mm:ss“的形式表示当前时间。这里每个数值都占据两位，不足两位时补0。如“00:01:22"。注意其中的冒号是西文的，不是中文的。



*提示：String.format()可以用和printf一样的方式来格式化一个字符串。*

另外写一个Main类，它的main函数为下面的样子，注意，必须原封不动地作为Main的main函数：

> public static void main(String[] args) {
>
> ​		java.util.Scanner in = new java.util.Scanner(System.in);
>
> ​		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
>
> ​		clock.tick();
>
> ​		System.out.println(clock);
>
> ​		in.close();
>
> ​	}

​	

**注意！在提交的时候，把Main、Clock和Display三个类的代码合并在一起，其中Main类是public的，而Clock和Display类是没有修饰符的。另外，千万注意第一行不能有package语句。**



**输入格式:**

采用给定的main函数无需考虑输入输出。

**输出格式：**

采用给定的main函数无需考虑输入输出。

**输入样例：**

采用给定的main函数无需考虑输入输出。

**输出样例：**

采用给定的main函数无需考虑输入输出。

时间限制：500ms内存限制：32000kb

