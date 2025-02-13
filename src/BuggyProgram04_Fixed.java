import java.util.Scanner;

public class BuggyProgram04_Fixed {
    

    public static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {


        // This program will print out all numbers in decreasing order

        System.out.print("Please enter the number you want to start counting down from: ");
        int num = input.nextInt();

        System.out.print("Please enter the number you would like to stop counting down from: ");
        int stopNum = input.nextInt();


        int i = num;
        while(i >= stopNum) {
            if(i <= stopNum) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
            i--;
        }
        System.out.println("Finished counting down! Exiting...");


    }


    /*
    ============================================
     Expected Output Samples:
    ============================================
     
    ----------------------------------
    Sample Output 1
    ----------------------------------
    Please enter the number you want to start counting down from: 10
    Please enter the number you would like to stop counting down from: 0
    10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
    Finished counting down! Exiting...

    ----------------------------------
    Sample Output 2
    ----------------------------------
    Please enter the number you want to start counting down from: 5
    Please enter the number you would like to stop counting down from: 10
    Finished counting down! Exiting...



    */


}
