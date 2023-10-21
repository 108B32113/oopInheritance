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
}
class Cbbb extends Caaa // Cbbb has not initial value so we have to add constructor
{
    //answer
    Cbbb(int n)
    {
        super(n); //because here been gotten inheritance by Caaa so the constructor's argument use by same place
    }

    public void show()
    {
        System.out.println("num=" + get());
    }
}
public class Class05
{
    public static void main(String args[])
    {
        Cbbb bb = new Cbbb(1); // self-added argument
        bb.show();
    }
}