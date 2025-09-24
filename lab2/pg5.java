import java.util.Scanner;
class Box {
    double length, breadth, height;

    Box() {
        length = breadth = height = 0;
    }

    Box(double side) {
        length = breadth = height = side;
    }

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class pg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box box1 = new Box();
        System.out.println("Volume of Box1 (default): " + box1.volume());

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        Box box2 = new Box(side);
        System.out.println("Volume of Box2 (cube): " + box2.volume());

        System.out.print("Enter length of box: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of box: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of box: ");
        double h = sc.nextDouble();
        Box box3 = new Box(l, b, h);
        System.out.println("Volume of Box3 (rectangle box): " + box3.volume());

        sc.close();
    }
}
