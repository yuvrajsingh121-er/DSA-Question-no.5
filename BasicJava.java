import java.util.*;

public class BasicJava {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter price of pencil, pen , eraser");
        float pencil = sc.nextFloat();
        float pen =  sc.nextFloat();
        float eraser =  sc.nextFloat();
        float total = pen + pencil + eraser;
        System.out.println("Bill is: "+total);

        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax: "+newTotal);
        
        sc.close();
    }
}

