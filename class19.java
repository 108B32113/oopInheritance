class Data
{
    private String name;
    private Test score;

    // (a)
    private class Test{ //name to use class name and not use "score"
        int english;
        int math;

        // (b)
        Test(int eng, int m){
            english = eng;
            math = m;
        }

        // (c)
        double avg(){ // it does't been setted a initial because it's not a variable, it's just a method to calculate
            return (english + math) / 2;
        }
    }

    Data(String name, int english, int math){
        this.name = name; // means its initial is itself word
        this.score = new Test(english, math); // call internal class and takes initial value must to use its variable name and not its class name
    }

    // (d)
    void show(){
        System.out.println("學生姓名:" + name);
        System.out.println("英文成績:" + score.english);
        System.out.println("數學成績:" + score.math);
        System.out.println("平均成績:" + score.avg());
    }
}

public class class19 {
    public static void main(String args[]){
        Data stu = new Data("Annie", 85, 92); // taked initial value for object
        stu.show();
    }
}







//### all class member if it will be use then it must be setted initial value