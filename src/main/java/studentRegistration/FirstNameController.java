package studentRegistration;

import java.util.Scanner;

public class FirstNameController {
    public String firstNam;

    public FirstNameController(){
        firstName();
    }



    public String firstName(){
        Scanner scan=new Scanner(System.in);

        do {

            System.out.println("Please Enter Your First Name");
            firstNam = scan.nextLine().trim();
            if (firstNam.isBlank()) {
                System.out.println("First Name Cannot Be Empty");
                continue;
            } else {
                boolean a = firstNam.replaceAll("[a-zA-Z ]", "").length() > 0;
                if (a) {
                    System.out.println("First Name Cannot Contain Any Character Except Letter");
                } else {

                    firstNam = firstNam.split(" ")[0];
                    firstNam = firstNam.substring(0, 1).toUpperCase() + firstNam.substring(1).toLowerCase();
                    break;
                }
            }
        } while (true);
        return firstNam;
    }
}
