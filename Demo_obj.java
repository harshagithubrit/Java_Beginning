
class Laptop {
    String Model;
    int price;

    public String toString() {
        return Model + ":" + price;
    }
}
public class Demo_obj {

    public static void main(String []args){
    Laptop obj = new Laptop();
    obj.Model = "HP";
    obj.price = 100;

    System.out.println(obj.toString());
    }
    }
