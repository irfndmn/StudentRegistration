package studentRegistration;

import java.util.Scanner;

public class SecondNameController {
    public String secondNam;


    public SecondNameController(){
        secondName();
    }


    public String secondName(){
        Scanner scan = new Scanner(System.in);



        do {
            System.out.println("Please enter your middle name if you have or press E");

            secondNam = scan.nextLine().trim();
            if (secondNam.equalsIgnoreCase("e")) {
                secondNam = "";
                break;
            } else if (secondNam.isBlank()) {
                continue;
            } else {
                boolean ortFrmt = secondNam.replaceAll("[a-zA-Z ]", "").length() > 0;
                if (ortFrmt) {

                    System.out.println("You Can't Enter a Name Containing Non-Letter Characters");
                } else {
                    secondNam = secondNam.split(" ")[0];
                    secondNam = secondNam.substring(0, 1).toUpperCase() + secondNam.substring(1).toLowerCase();
                    break;
                }
            }
        } while (true);
        return secondNam;

    }
}
