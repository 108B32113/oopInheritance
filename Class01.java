class Caaa
{
    public int num1;
    public int num2;
}

class Cbbb extends Caaa
{
    void set_num(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    void show()
    {
        System.out.println(""+ num1 + " " + num2);
    }
}

public class Class01 {
    public static void main(String args[])
    {
        Cbbb bb = new Cbbb();
        bb.set_num(5, 10);
        bb.show();
    }
}
