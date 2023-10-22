// hw10_11, 利用父類別變數存取子類別成員的練習(一)
class CShape // 父類別CShape
{
    public double area()
    {
        return 0.0;
    }
}

//(a)
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
//(b)
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

//(c)
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

public class Class11 {

//(e)part-judge max object method
    public static CShape findMax(CShape... shapes) // CShape is a existed class name, shapes is a self-setted argument name and it's a variable
    {
        if(shapes.length == 0)
        {
            return null;
        }
    
    CShape maxShape = shapes[0];
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
        CCircle cir1 = new CCircle(1);
        CCircle cir2 = new CCircle(2);
        CSquare squ1 = new CSquare(1);
        CSquare squ2 = new CSquare(2);
        CTriangle tri1 = new CTriangle(1, 1);
        CTriangle tri2 = new CTriangle(2, 2);

        CShape maxShape = findMax(cir1, cir2, squ1, squ2, tri1, tri2);

        if(maxShape != null) // left a number to compare size
        {
            System.out.println("Largest area is" + maxShape.getClass().getSimpleName()); //getClass()       getSimpleName() are default methods
                                                                                         //got a Class      get Class name              
        }else{
            System.out.println("No shapes to compare");
        }

// //(e)part-object_(土法煉鋼建調用方法)
//         /*
//         Even each uses same method but uses diffirent class,
//         so each they will produces diffirent area value by 
//         self-meant shape(形狀)
//         */
//         double areaCir1 = cir1.area();
//         double areaCir2 = cir2.area();
//         double areaSqu1 = squ1.area();
//         double areaSqu2 = squ2.area();
//         double areaTri1 = tri1.area();
//         double areaTri2 = tri2.area();
    }
}
