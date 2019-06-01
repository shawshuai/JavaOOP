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