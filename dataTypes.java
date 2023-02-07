import java.util.*;
class dataTypes{
    public static void main(String[] args){
        //System.out.println("Good morning");
        //System.out.println("applying ");
        int age; String name;
        Scanner obj = new Scanner(System.in);
        name=obj.nextLine();
        System.out.print("name is: "+name);
        age=obj.nextInt();
        System.out.print("you age is"+age);
    }
}