import java.util.Arrays;
import java.util.Scanner;

public class marchquiz
{
	public static void main(String[] args) {
        int [] all = {8, 3, 55, 9, 10, 3, 66, 31, 3};

        //Part A
        int [] odd = new int[10];
        int oddLength = 0;

        for (int i = 0; i < all.length;) {
            if (all[i] % 2 == 1) { 
                odd[oddLength] = all[i]; 
                oddLength++; 
            }
            i++;
        }
        
        System.out.print("After removing the even numbers, here are the odd numbers in the list: ");
        for (int y = 0; y < oddLength;) {
            System.out.print(odd[y] + " ");
            y++;
        }
        System.out.println("");
        System.out.println("");

        //Part B
        Scanner x = new Scanner(System.in);  
        System.out.print("Enter a number: ");
        String input = x.nextLine();
        
        int number = Integer.parseInt(input);

        for(int i = 0; i < all.length; i++){
            for(int j = i+1; j < all.length; j++){
                if (all[i] + all[j] == number) {
                    System.out.println(all[i] + " " + all[j]);
                }
            }
        }
        System.out.println("");

        //Part C
        Arrays.sort(all);
        for (int i = 0; i < all.length; i++) {
            System.out.print(all[i] + " ");
        }
    }
}