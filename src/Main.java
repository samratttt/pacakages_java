// import all classes of package Karki { Add }
// Add class has method Addition

//import Karki.*;
import Karki.Add;
public class Main {
    public static void main(String[] args) {

        //make object of imported class Add
        Add obj = new Add();
        System.out.println(obj.addition(1,2));
    }
}