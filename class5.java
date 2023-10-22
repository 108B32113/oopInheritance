class CCount{
    int cnt; //這種資料成員 是一種變數 ### 使用實例變數 很重要

//void不是修飾符 是返回類型(return type)的關鍵字
    public CCount(){ //為一建構元 可以不用有參數 名稱要跟類別一樣 此函數用來表示記數初值
        cnt = 0;
        /*
         * 之前類別基礎時的函數是單純設計一個方法
         * 但是他回傳的值是已經從main()理財建立物件傳遞回來的
         * ex:
         * int surfaceArea(){
           return length*width*6;
           }
         */
    }
    public void count(){ //記數方法 將cnt加1
        cnt++;
    }
    public int getCount(){
        return cnt; //獲取當前記數值的方法
    }
    public void setZero(){
        cnt = 0;
    }
    public void setValue(int n){
        cnt = n;
    }
}

public class class5 {
    public static void main(String args[]){ //public/static都是修飾符 只是前者是存取修飾符
        CCount counter = new CCount();
    }
}

/*
(d_answer) 實例變數, ### 因為每個CCount類別的實例（物件）都應該擁有自己的計數器
而不是共用一個計數器 如果將cnt宣告為類別變數 則所有 CCount 物件都會共用相同
的計數器 會混亂掉

(e_answer) 兩者都可以, 除了向本程式中編寫之方式 其實個人覺得count()函數
可以使用static讓之後再main()當中可以直接調用方法 只需打上.count()在變數
後方就可以直接讓記數加1 而不用先建立物件 會方便一點
*/

















/*
// 存取修飾符Access Modifier/Access Specifier(說明符)
在Java中，如果沒有明確指定成員變數（欄位）或
方法的存取修飾符（public、private、protected等），
則它們將具有預設的存取級別，這個預設級別被稱為
「包級私有」（package -private）或有時被稱為“預設”（default）等級。

包級私有意味著成員變數或方法只能在同一個包中的其他類別中訪問，
而對於不在同一個包中的類別來說，這些成員將是不可見的。 
這種預設等級提供了一定的封裝性，因為它限制了對成員的存取。
 */