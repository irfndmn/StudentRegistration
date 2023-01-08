package studentRegistration;

import java.util.Scanner;

public class LastNameController {
    public String lastNam;


    public LastNameController(){
        lastN();
    }




    public String lastN(){
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Please Enter Your LastName");
            lastNam = scan.nextLine().trim();
            if (lastNam.isBlank()) {
                System.out.println("Surname Can't Be Empty");
            } else {
                boolean syFrm = lastNam.replaceAll("[a-zA-Z ]", "").length() > 0;
                if (syFrm) {
                    System.out.println("Surname Cannot Contain Any Character Except Letter");
                } else {

                    lastNam = lastNam.split(" ")[0];
                    lastNam = lastNam.substring(0, 1).toUpperCase() + lastNam.substring(1).toLowerCase();
                    break;
                }

            }
        } while (true);
        return lastNam;
    }

}
