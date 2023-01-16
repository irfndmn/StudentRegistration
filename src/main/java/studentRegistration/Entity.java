package studentRegistration;

import java.util.Scanner;

public class Entity {
    public  void start(){
        do {
            Scanner scan = new Scanner(System.in);
            User obj = new User();


            System.out.println();
            System.out.println("*********************");
            System.out.println();
            System.out.println("User Full Name       : " + obj.name);
            System.out.println("User Goverment Id    : " + obj.idTc);
            System.out.println("User Phone Number    : " + obj.tlNo);
            System.out.println("User E-Mail Address  : " + obj.eMail);

            System.out.println();
            System.out.println("*********************");

            System.out.println();
            System.out.println("User Age               : " + obj.yas);
            System.out.println("User Graduation Year   : " + obj.mezuniyet);
            System.out.println("User Registration Year : " + obj.kayit);

            System.out.println();
            System.out.println("***********************");

            System.out.println();
            System.out.println("User Account Name     : " + User.usNam);
            System.out.println("User Account Password : " + User.userPsw);


            System.out.println("Q to Terminate, Press Any Key to Continue");
            String a = scan.next();
            if (a.equalsIgnoreCase("q")) {
                System.out.println(User.m);
                break;
            }
        }while (true);
    }
}
