/**
 * Created by 张连芳 on 2016/10/26.
 */
public class TestShape {public static void main(String[] args) {
// 构造一个边长为3的正方形
  Shape square = new Square(3) ;
// 构造一个半径为2的圆
    Shape circle = new Circle(3) ;

// 构造一个高和底分别为3,4的三角形   5555555555555555555555
    Shape triangle1 = new Triangle(3, 4);
    System.out.println(square.getArea());
    System.out.println(circle.getArea());
    System.out.println(triangle1.getArea());
}
}
