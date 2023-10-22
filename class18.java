public class class18 {
    public static void main(String args[])
    {
    
    }
    static class CCircle
    {
        public double pi = 3.14;
        public double radius;

        public CCircle(double r)
        {
            radius = r;
        }

        public void show(){ // external
            /*內部類別通常在需要存取外部類別的私有成員或實現
            與外部類別緊密相關的功能時使用 */
            double area = pi * radius * radius;
            System.out.println("radius: " + area);
        }
    }
}









/*
匿名內部類別（Anonymous Inner Class）是一種在Java程式語言中
常見的概念，它是一種內部類別，但沒有明確的類別名稱。 這種
內部類別通常用於建立一個實作某個介面或繼承自某個類別的對象，
而不必明確地定義一個特定的類別
*/