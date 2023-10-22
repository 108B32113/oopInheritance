class CWin { //這部分是設計程式
    public static int cnt = 0; //實例變數追蹤物件個數 只有跟他互相傳遞資訊的物件可以用這裡的資料
    String color;
    int width;
    int height;

    // (a) 每次建立物件 這裡就會幫cnt變數加1
    public static int count(){ //實例變數 也有自己的記憶體空間
        cnt++;
        return cnt;
    }

    // (b) 有參數的CWin建構元 用來設定 顏色 寬度 高度的值 這邊是使用main()來增加有這三個參數的值的新物件時用到的
    public CWin(String str, int w, int h){ //建構元設定初值時 如果是用建立的物件幫之前的類別建立初 要在敘述中 成員的名字前加上this.
        this.color = str;
        this.width = w;
        this.height = h;
        //建構元可以接受參數 沒回傳值 所以也不用加void
        //和多載一樣 每一個參數(同名)建構元的參數列表種類是唯一的
        //如果要同個方法記錄不同名稱的物件 但他們導向同個對象 就要用建構元
        cnt++;
     }

    // (c) 無參數的CWin建構元 這邊是直接在敘述中設定三個在前一個方法中原本要用參數去設定變數 的方法 來傳回物件的值
    public CWin(){
        this.color = "Red";
        this.width = 2;
        this.height = 2;
        cnt++;
    }

    // (d) 將cnt歸零的方法
    public int setZero(){
        return cnt = 0;
    }

    // (e) 將cnt設為值n的方法
    public int setValue(int n){
        return cnt = n;
    }
}

public class class8{ //這部分是實際使用程式
     public static void main(String[] args){
        // 建立多個CWin物件對象
        // CWin obj1 = new CWin(); //只要這邊多一行 CWin()
        // CWin obj2 = new CWin();
        // CWin obj3 = new CWin();
        
        // System.out.println("total count:" + CWin.count());//調用CWin()當中的count()方法
    }
}


// 其餘答案
// (f) 實例函數, 因題目多次要求使用建構元作答 使用實例函數才能在編程最初時就給定初值並馬上著手開始修改、賦值
// (g) 兩者都可, 因題目只是要求用其與物件建立這個動作做聯動 但沒有說明不可以先在類別中建立類別變數 在建立物件與賦值

















//用this是要從main()把物件參數傳遞回去方法內用的
/*
    //範例
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    ...
    Person person1 = new Person("Alice", 30); //傳回上面的Person()建構元
    Person person2 = new Person("Bob", 25);
 */