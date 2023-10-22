class Caaa
{
    public int num1;
    public int num2;

    Caaa()
    {
        num1 = 1;
        num2 = 1;
    }

    Caaa(int a, int b)
    {
        this.num1 = a;
        this.num2 = b;
    }
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

    Cbbb(int a, int b)
    {
        super(a, b); // call super class that class had a, b argument
    }

    //q13_answer
    Cbbb()
    {
        super(); // argument will be same
    }
}

public class Class13 {

    public static void main(String args[])
    {  
        Caaa aa = new Caaa();
        System.out.println(aa.num1);

        Caaa aa2 = new Caaa(1, 2);
        /*use second constructor be like this, there's two arguments*/
        System.out.println(aa2.num1 + " " + aa2.num2);

        Cbbb bb = new Cbbb(1, 2); // don't forget add arguments
        System.out.println(bb.num1 + " " + bb.num2);
    }
}
