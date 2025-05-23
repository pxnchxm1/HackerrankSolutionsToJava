import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Books extends Book{

    void setTitle(String s){
        this.title = s;
    }
    void display(){
        System.out.println("The title is: "+title);
    }
}
public class JavaAbstractClass {

    public static void main(String[] args) {
        Books b = new Books();
        Scanner sc = new Scanner(System.in);
        b.setTitle(sc.nextLine());
        b.display();
        sc.close();
    }
}
