// hw9_3, 從某一建構元呼叫另一建構元
class Caaa // 定義類別Caaa
{
    private int value;

    public Caaa()
    {
        this.value = 10; //試填寫此處的程式碼，使得呼叫此建構元時，value的值會被設為10
        System.out.println("value="+value);
    }
    public Caaa(int i)
    {
        value = i;
        System.out.println("value="+value);
    }
}
public class class3 // 因為檔名 所以改成class3 原本題目要求hw9_3
{
    public static void main(String args[])
    {
        Caaa obj1=new Caaa();
        Caaa obj2=new Caaa(12);
    }
}
/*
answer:
(a) 在第8行
(b) Caaa(), Caaa(int i)
(c) 可以, 另一個class public class class3 有跟他交換訊息
    所以 class Caaa可以在前綴加上public
(d) 運行結果無引響, 但可能往後如果有接續此程式 加寫其他內容
    可能會讓原本private的成員容易形成錯誤或是資料遺失
    例: 封裝遺失、依賴性增加、其他潛在的數據遺失問題
 */