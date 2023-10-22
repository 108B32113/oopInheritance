class CRectangle
{
    int width;
    int height;

    CRectangle(int w, int h){ // 此為建構元 資料成員的值是在之後main()中 才用建立的物件設定的
        width = w;
        height = h;
    }

    //(b)小題
    // CRectangle(){ // 這邊是直接給默認的值
    //     width = 10;
    //     height = 8;
    // }

    //(c)小題
    CRectangle() {
        this(10, 8); // 使用this()呼叫上面的建構元 傳遞預設值 width, height之後會變成10 和 8
        // 使用this()可以替沒有參數的建構元傳遞初值
    }
}

public class class1 {
    
}
