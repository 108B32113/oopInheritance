class Namecard
{
    private String name;
    private String address;
    private Phone data;

    // (a)
    private class Phone{ // there's name named about upon private Phone data that Phone's word
    // there's a private class that means it can be use only by its external class
    // if it been setten get...method that it can visit private member
        
        String company;
        String cell;

        // (b)
        Phone(String s1, String s2){ // company = s1 = new company value in Phone class...
            company = s1;
            cell = s2;
        }
    }

    public Namecard(String name, String address, String company, String cell) {
        // build it initial buiding method
        this.name = name;
        this.address = address;
        this.data = new Phone(company, cell); //###
    }

    // (c)
    public void show(){ // change to under just setted object format
        System.out.println("好友姓名:" + name);
        System.out.println("聯絡地址:" + address);
        System.out.println("公司電話:" + data.company);
        System.out.println("手機號碼:" + data.cell);
    }
}

public class class17 {
    public static void main(String args[]){
        // (d)
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
                                      //can use this way to define all variable about the new object value in same class
                                      //### there just has Namecard's variable property but no builded Namecard's initial mathod of building
                                      //### It doesn't been setted initial so it may be setted a constructor named Namecard upon show() in Namecard class
        first.show();
    }
}
