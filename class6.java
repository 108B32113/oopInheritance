class Calculator {
    public static int add2n(int n) { //因為要一個方法就包含兩種計算結果所以要用遞迴
        int sum = 0; //總數初值

        //注意 因為要重複執行 所以這不是if
        for (int i = 1; i <= n; i++){//從1開始加 如果小於之後調用方法提供參數的物件值 就繼續加1
            // java 的參數也要給type

            sum += i;//將目前的總數與條件式加總的數相加 得到最後的總數
        }
        return sum; //將總數回傳給迴圈的起點 然後在還沒滿足結束條件之前繼續執行條件是要求的計算
    }

    public static void main(String[] args) {
        int res1 = add2n(5);//因為add2n是類別函數 所以調用他的方法的對象可以不用是物件 但是要給資料型態 切記 只要建立對象 不管是變數 還是物件都要有 因為這是java
                              //只有參數一個的時候才能夠直接調用 不需要在前綴加上類別名
        int res2 = add2n(10);

        System.out.println(res1);
        System.out.println(res2);
    }
}


public class class6 {
}




//OOP也都是可以隨意建立變數 只是他不是一個物件
//變量:是抽象的 只是用來存取資料型態的一個概念   物件:是相對程式的概念來看 是 實例的

//"\n" 是換行