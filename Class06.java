class CTriangle
{
    protected int base;
    protected int height;
    public double area;

    protected void show()
    {
        System.out.println("base=" + base + ", height=" + height);
    }
}
//(a)
class CData extends CTriangle
{
    CData(int a, int b)
    {
        this.base = a;
        this.height = b;
    }

    //(b)
    double area()
    {
        show();
        double result = base * height / 2; //coded a local variable(局部變量) result to contain calculation
        System.out.println(result);
        return result; //傳回 public double area變數裡
    }
}

public class Class06 {
    //(c)
    public static void main(String args[])
    {
        CData obj=new CData(3, 8);
        obj.area();
    }
}
