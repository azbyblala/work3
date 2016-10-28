/**
 * Created by 张连芳 on 2016/10/26.
 */
public class Triangle extends Shape{
    private double a=0;
    private double b=0;
    private double c=0;
    private double h=0;
    public Triangle (double a,double h){
        this.a=a;
        this.h=h;//构造函数
    }
    public double getArea() {
            return ( a * h / 2);
        }
    }
