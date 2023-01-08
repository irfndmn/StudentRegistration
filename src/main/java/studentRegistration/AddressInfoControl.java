package studentRegistration;

import java.util.Scanner;

public class AddressInfoControl {
    public String phoneNumber;
    public String eMail;

    public AddressInfoControl(){
        checkInfo1();
        checkInfo2();
    }





    public String checkInfo1(){
        Scanner sc = new Scanner(System.in);

        boolean telFrmt;

        do {
            System.out.println("Please Enter a Valid Phone Number, Phone Number Must Start With Zero And Have 11 Digits");
            phoneNumber = sc.nextLine().trim().replaceAll(" ","");
            telFrmt = phoneNumber.startsWith("0") && phoneNumber.length() == 11 && phoneNumber.replaceAll("[0-9]", "").length() == 0;
        } while (!telFrmt);
        return phoneNumber;

    }





    public String checkInfo2(){
        Scanner sc = new Scanner(System.in);



        boolean emlFrmt;
        do{
            System.out.println("Please Enter a Valid Mail Address");
            eMail=sc.nextLine().trim();
            emlFrmt=eMail.endsWith("@hotmail.com")||eMail.endsWith("@gmail.com")||eMail.endsWith("@outlook.com")&&!eMail.startsWith("@")&&!eMail.contains(" ");
        }while (!emlFrmt);

        return eMail;

    }




}
