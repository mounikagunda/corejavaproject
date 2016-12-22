package MyAl;

import java.util.ArrayList;

public class Clone {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("Fist");
        arrl.add("Secnd");
        arrl.add("Thid");
        arrl.add("Radom");
        System.out.println("Actual ArrayList:"+arrl);
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        System.out.println("Cloned ArrayList:"+copy);
    }
}
