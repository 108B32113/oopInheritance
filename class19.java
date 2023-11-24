class CRectangle
{
    protected int length;
    protected int width;

    //(a)
    CRectangle(int l, int w)
    {
        length = l;
        width = w;
    }

    int area()
    {
        return length * width;
    }
}

public class Class19 {
    public static void main(String args[])
    {
        //(b)
        CRectangle rect = new CRectangle(2, 6);

        //(c)
        System.out.println("length=" + rect.length + ", " + "width=" + rect.width + ", " + "area=" + rect.area()); // directly called method and the method can not to built by variable in class before
            // call variable be use obj".variable or method name"
    }
}
