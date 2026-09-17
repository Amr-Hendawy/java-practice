import java.util.Scanner;
// public class Addition {
//     // main method begins excution of Java App

//     public static void main(String[] args) {
//         // create a Scanner to obtain input from the command window
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter The First Integer"); // Prompt
//         int number1 = input.nextInt(); // read first number from user
        
//         System.out.println("Enter The Second Integer"); // Prompt
//         int number2 = input.nextInt(); // read second number from user
//         int sum = number1 + number2; //add numbers, then store them in sum

//         System.out.printf("Sum is %d%n", sum); // display sum
//     } // end method main
    

// } // end class Addidtion
// public class DisplayOutput {
//     // main method begins excution of Java App

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         // this program to calucualte rectangle Area
//         int length;
//         int width;
//         int area;
//         // int length,width;
//         System.out.println("Enter Rectangle Length"); // Prompt
//         length = input.nextInt();
        
//         int number1 = input.nextInt(); // read first number from user
//         System.out.println("Enter Rectangle Width"); // Prompt

//         width = input.nextInt();
//         area = length * width;
//         System.out.println(area); // Prompt

//         System.out.printf("The Rectangle area is %d", area); // display sum
//     } // end method main
    
// } // end class Addition

// exampe two
public class DisplayOutput {
    // main method begins excution of Java App

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fname = "";
        float salary;
        float net_salary;
        System.out.println("Enter Your first name"); // Prompt
            fname = input.next();

            System.out.println("Enter your salary");
            salary = input.nextFloat();
            
            net_salary = salary - (salary * 0.10f);
            // System.out.println(net_salary);
            System.out.printf("Your Net Salary is %f", net_salary);
            
    } // end method main
    
} // end class Addidtion

// varables are places to store values
// / like x and y and we call it by theri names
// values are vaiances like
// text - numbers - true false 
// every var has datatype and size
// if I store 5 so it's int
// 3.4 it's float flt
// test is string
// char for one char
// double for long float
// short smaller number 
// bool true or false
// show datatypes photo
// var declaration means definition like inty;
// the initialization is y = 10; means initial value
// example that get the area of rectangle
// explain from rectangle_area img
// I will get input from user by
// import java.util.Scanner;
// I tell java give me  an object from it then Scanner input = new Scanner(System.in);
// System.in means from the user input by himself
// nextInt() to get int
// get example image 
// print and format text printf