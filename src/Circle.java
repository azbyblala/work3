/**
 * Created by 张连芳 on 2016/10/26.
 */
public class Circle extends Shape {// 圆的半径
    private double r = 0;
    // 圆周率
    private final static double PI = 3.14;
    // 构造函数
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return (PI * r * r);
    }
}
