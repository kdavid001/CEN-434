import java.util.Scanner;


public class classwork {
    static int totalStudents = 0;
    static int[] studentPercentage;
    static int[] grades = new int[5]; //Array of 5 columns: A, B, C, D, F
    static Scanner input = new Scanner(System.in);

    public static void inputPopulation(){
        System.out.println("Enter the total number of students in class");
        totalStudents = input.nextInt();
        studentPercentage = new int[totalStudents];
    }

    public static void inputStudentPercentages(){
        for (int i = 0; i<totalStudents; i++){
            System.out.println("Enter score" + (i+1));
            studentPercentage[i] = input.nextInt();
        }
    }

    public static void computeStudentGrade(){
        for(int percent: studentPercentage){ //for every percent in student percentage
            if(percent >= 70){
                grades[0]++;  //Increment students with As
            }
            else if(percent >= 60){
                grades[1]++;
            } else if ( percent >= 50) {
                grades[2]++;
            } else if (percent >= 45) {
                grades[3]++;
            }else {
                grades[4]++;
            }
        }
    }


    public static void printGrades(){
        System.out.println("A: " + grades[0]);
        System.out.println("B: " + grades[1]);
        System.out.println("C: " + grades[2]);
        System.out.println("D: " + grades[3]);
        System.out.println("F: " + grades[4]);
    }


    public static void main(String[] args){
        inputPopulation();
        inputStudentPercentages();
        computeStudentGrade();
        printGrades();
    }
}