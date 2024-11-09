import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        // Input the size of the array and elements
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] numbers= new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        // Input the value to find
        System.out.print("Enter the element to search for: ");
        int x=sc.nextInt();

        //output array element
        for(int i=0; i<size;i++){
            if(numbers[i]==x){
                System.out.println("Element found at index " + i);
            }
        }
        sc.close();
    }
}