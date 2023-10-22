import java.util.Scanner;

class Circle {
    private static double pi = 3.14;
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public void show() {
        /*printf 方法是一種格式化輸出的方式，允許你指定字串中的佔位符（例如%.2f），然後在後面的參數中
        傳遞對應的值，這些值會根據佔位符的類型和格式 進行插入
        it'll arrange about sequence of variable about right side from ","
        */
        System.out.printf("radius = %.2f, area = %.2f\n", radius, pi * radius * radius); // only can use complete formula because the pi*...*radius not a variable
    }
}

public class class16 { // because it's the input quiz so it can be used directly in the main() area
    public static void main(String[] args) {
        Circle[] cir = new Circle[6]; // create a five digits of list
        Scanner scanner = new Scanner(System.in); // new object of Scanner that it been imported by module of Scanner the java default...

        for (int i=0; i<cir.length; i++) {
            System.out.print("input [" + i + "] digit, it's radius: ");
            double radius = scanner.nextDouble(); // import back to variable of class
            cir[i] = new Circle(radius); // take a value of Circle() method
        }

        for (int i = 0; i < cir.length; i++) { // checking all obj to use this for cycle
            cir[i].show(); // use show() to display all cir object information
        }
    }
}
