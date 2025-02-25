import java.util.Scanner;

public class student_info {
    static int totalstudents = 0;
    static int[] inputpercentage;
    static int[] grades = new int[5]; //Array of 5 columns: A, B, C, D, F
    static Scanner input = new Scanner(System.in);



    public static void inputpopulation() {
        System.out.println("Enter the number of students you want to add: ");
        totalstudents = input.nextInt();
        inputpercentage = new int[totalstudents];

    }

    public static void collectpercentage() {
        System.out.println("Enter the percentages of students you want to add: ");
        for(int i = 0; i< totalstudents; i++) {
            System.out.println("score "+ (i+1));
            inputpercentage[i] = input.nextInt();
        }
    }

    public static void converttogrades() {

        for(int i = 0; i< totalstudents; i++) {
            if (inputpercentage[i] >= 70) {
                grades[0]++;
            } else if (inputpercentage[i] >= 60 && inputpercentage[i] < 70) {
                grades[1]++;
            } else if (inputpercentage[i] >= 50 && inputpercentage[i] < 60) {
                grades[2]++;
            }
            else if (inputpercentage[i] >= 40 && inputpercentage[i] < 50) {
                grades[3]++;
            }
            else if (inputpercentage[i] >= 20 && inputpercentage[i] < 50) {
                grades[4]++;
            }
        }
    }

    public static void printgrades() {
            System.out.println("Grade A: "+ grades[0]);
            System.out.println("Grade B: "+ grades[1]);
            System.out.println("Grade C: "+ grades[2]);
            System.out.println("Grade D: "+ grades[3]);
            System.out.println("Grade E: "+ grades[4]);
    }

    public static void main(String[] args) {
        inputpopulation();
        collectpercentage();
        converttogrades();
        printgrades();
    }
}
