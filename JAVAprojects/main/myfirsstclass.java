public class myfirsstclass {
     public static void main(String[] args){
         System.out.println("myfirsstclass");
         System.out.println("i rule");
         int x = 20;
         String myName = "Dirk";
         System.out.println(myName);
         System.out.println(x+x / 2);

         // while loop
         while (x > 12) {
             x = x / 2;
         }

         // for loop
         for (int i = 0; i < x; i = i + 1 ) {
             System.out.println(i);
         }
            int y = 10;
         //if else statement
         System.out.println("y must be more than 10" + x);


         double result = Math.sqrt(x);
         System.out.println(result);

         // switch statements
         switch (x = 3){
             case 1:
                 System.out.println("y must be more than 10");
                 break;
                 case 2, 3, 4:
                     System.out.println("y must be less than 10");
                     break;
             case 5:
         }


         // arrays
         String[] pets = {"fido", "zeus", "Bin"};
     }

}

class Exercise1b {
public static void main(String[] args) {
    int x = 20;
    while (x > 12) {
        if (x > 10) {
            System.out.println("x must be less than 10" + x);
        }
    }
}
}

//public static void main