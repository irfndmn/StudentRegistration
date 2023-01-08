package studentRegistration;

import java.util.Scanner;

public class IdControl {
    public String Id;

    public IdControl(){
        checkIdThanPrint();
    }

    public String checkIdThanPrint(){
        boolean idFrmt;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Please Enter Your Tr. Identity Number... It Must Be 11 Digits");
            Id = sc.nextLine().trim().replaceAll(" ","");

            idFrmt = Id.replaceAll("\\d", "").length() == 0 && Id.length() == 11;

        }while (!idFrmt);
        return Id;

    }


}
