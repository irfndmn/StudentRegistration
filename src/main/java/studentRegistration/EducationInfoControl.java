package studentRegistration;

import java.util.Scanner;

public class EducationInfoControl {


    public byte age;
    public int registrationYear;
    public int graduationYear;

    public EducationInfoControl(){
        age();
        graduationYear();
        registrationYear();

    }



public byte age(){
    do {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        age = scan.nextByte();
    }while (age<0);
    return age;
}

public int registrationYear(){
    Scanner scan=new Scanner(System.in);
    System.out.println("User Please Enter the Year of Your Registration in the School");
    registrationYear= scan.nextInt();
    while(registrationYear<1900||registrationYear>graduationYear){
        System.out.println("Please Enter Valid Year Of Registration.. Registration Year Cannot be Greater Than Graduation Year or Less Than 1900.");
        registrationYear=scan.nextInt();
    }
    return registrationYear;

}


public int graduationYear(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter Your Graduation Year");
   graduationYear= Math.abs(scan.nextInt());
    while(graduationYear>2022||graduationYear<1900){
        System.out.println("Please Enter a Valid Year For Your Graduation Year");
        graduationYear=scan.nextInt();
    }
    return graduationYear;
}



}
