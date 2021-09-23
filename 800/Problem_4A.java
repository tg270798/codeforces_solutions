import java.util.Scanner;
public class watermelon{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        
        if(W == 2)
            System.out.print("NO");
        else{
        
        if(W%2==0)
            System.out.print("YES");
        else
            System.out.print("NO");
        }
    }
}
