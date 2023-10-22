// inherited from Ch9_13 
class Circle{
    private static double pi=3.14;   
    private double radius;
 
    public Circle(double r){
        radius=r;
    }
    public static double compare(Circle[] c){  // compare() 函數   
        double max=0.0;
        for(int i=0;i<c.length;i++)
            if(c[i].radius>max)
                max=c[i].radius;
        return max;
    }
    public double average(Circle c[]){ // there are arguments that suppose to use c[] to calculate
        return (c[0].radius + c[1].radius + c[2].radius / 3); // using list object to get calculate needing to add .radius(variable name in class)
    }
}
public class class15{
    public static void main(String[] args){
        Circle[] cir;
        cir=new Circle[3]; // declared it's a 3 digits of list

        cir[0]=new Circle(1.0); // using Circle() to give a radius value
        cir[1]=new Circle(4.0); 
        cir[2]=new Circle(2.0); 
        System.out.println("Largest radius = "+Circle.compare(cir)); 
    }
}