// hw10_12, 利用父類別變數存取子類別成員的練習(一)
class CShape // 父類別CShape
{
    public double area()
    {
        return 0.0;
    }
}

class CCircle extends CShape
{   // restart to build a class to get inheritance about super to sub
    public double radius; // got a new variable about circle's properties
    public double pi = 3.14;

    public CCircle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return pi*radius*radius;
    }
}
class CSquare extends CShape
{
    public double sideLength;

    public CSquare(double sideLength)
    {
        this.sideLength = sideLength;
    }
    public double area()
    {
        return sideLength * sideLength;
    }
}

class CTriangle extends CShape
{
    public double base; // public..._訪問修飾符（access modifier）
    //data member must need "typeName, variableName in java"

    public double height;


    public CTriangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    public double area()
    {
        return base * height / 2;
    }
}

public class Class12 {

//(e)part-judge max object method
    public static CShape findMax(CShape... shapes) // CShape is a existed class name, shapes is a self-setted argument name and it's a variable
    {
        if(shapes.length == 0) // counter judging problem always need a initial recording value
        {
            return null;
        }
    
        CShape maxShape = shapes[0]; // built a max object value to record sh
        for(CShape shape : shapes)
            {
                if (shape.area() > maxShape.area())
                    maxShape = shape;
            }
    return maxShape;
    }



    public static void main(String args[])
    {
//(d)
        CShape[] shapes = new CShape[6]; // built a CShape type list
          //use list to save object

        shapes[0] = new CCircle(1);
        shapes[1] = new CCircle(2);
        shapes[2] = new CSquare(1);
        shapes[3] = new CSquare(2);
        shapes[4] = new CTriangle(1, 1);
        shapes[5] = new CTriangle(2, 2);

        CShape maxShape = findMax(shapes);

        if (maxShape != null)
        {
            System.out.println("Largest area is " + maxShape.getClass().getSimpleName());
        }
        else
        {
            System.out.println("No shapes to compare");
        }
    }

}
