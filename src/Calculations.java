import java.util.*;

public class Calculations {

    public static void main(String[]args) {
        Scanner ScanInt = new Scanner(System.in);
        System.out.println("please enter the length");
        int length = ScanInt.nextInt();
        System.out.println("please enter the breadth");
        int breadth = ScanInt.nextInt();

        int area = length*breadth;
        System.out.print("This is your answer: "+area+"\n");

        System.out.print(System.currentTimeMillis()+"\n");

        for(int i = 0; i<=10;i++){
            System.out.print(area + i+"\n");
        }
    }


}
