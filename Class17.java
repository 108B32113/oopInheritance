class Car
{
    protected String owner; // Just transfor between super... and sub... 
    protected String id;

    Car(String own, String s)
    {
        // Enable(v.) to no initial value
        owner = own;
        id = s;
    }

    final void show()
    {
        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼:" + id);
    }

    // new show() and no final
    void newShow()
    {
        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼:" + id);
    }

    //(a)
    void CRectangle(String own, String s)
    {
        owner = own;
        id = s;
    }
}
//(b)
class CColor extends Car
{
    public String color;

// constructor for object mycar's argument
    CColor(String own, String s, String c)
    {
        super(own, s);
        color = c;
    }

//(c)
    CColor(String own, String s)
    {
        super(own, s);
    }

//(d)&
//(e) 第一次執行時 因為父類別的類型是final 所以不可改寫 ==> 新增一個newShow()函數 給此調用
    public void newShow() // unenable to override final data
    {
        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼:" + id);
        System.out.println("車身顏色:" + color);
    }
}

public class Class17 {
    public static void main(String args[])
    {
        CColor mycar = new CColor("Riaan" , "A1-2345", "Black");
        mycar.newShow();
    } 
}






//setted of final that class can't be overriding just can build a new method