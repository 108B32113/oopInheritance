// hw10_5, 簡單的繼承範例
class Caaa
{
    private int num;

    public Caaa(int n)
    {
        num = n;
    }
    public int get()
    {
        return num;
    }

    //(a)
    void display()
    {
        System.out.println("prrinted from Caaa class");
    }
}
class Cbbb extends Caaa // Cbbb has not initial value so we have to add constructor
{
    Cbbb(int n)
    {
        super(n); //because here been gotten inheritance by Caaa so the constructor's argument use by same place
    }

    public void show()
    {
        System.out.println("num=" + get());
    }

    //(b)
    void display()
    {
        System.out.println("prrinted from Cbbb class");
    }
}
public class Class09
{
    public static void main(String args[])
    {
    //(c)
        Cbbb bb = new Cbbb(1); // self-added argument
        bb.show();
        bb.display(); // because it got overrided in sub class Cbbb so that bb.play will output sub class
    }
}