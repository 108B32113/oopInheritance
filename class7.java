class Cal {
    public static int power(int x, int n) {
        int result = 1; //計算冪值()都是從1開始 因為0次方都是1 沒意義
        for (int i = 0; i<n; i++) { //如果相乘的次數小於提供的冪 就會一直再多成一次 疊上去
            //++可以理解成再一次

            result *= x;//開始時是1*2=2^1 然後第二次迴圈2*2=2^2
        }
        return result;//乘到n次之前都會不段從這裡回傳來更新目前的總數值
    }
}

public class class7 {
    public static void main(String args[]){
        int res1 = Cal.power(2, 5);/*因為有兩個參數 程式無法判斷要調用哪一個power
        加上了Cal.之後程式才能分辨x和n兩個參數屬性*/
        int res2 = Cal.power(3, 2);
        System.out.println(res1 +"\n"+ res2);
    }
}
