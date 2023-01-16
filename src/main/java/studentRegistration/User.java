package studentRegistration;

import java.util.HashMap;
import java.util.Map;

public class User {


    String name;
    String idTc;
    String tlNo;
    String eMail;

    int yas;
    int mezuniyet;
    int kayit;


    static String usNam;

    static String userPsw;
    static int count=100;
   public static Map<String,String> m=new HashMap<>();
   public String listNam;


    public void setUsLis(){
       listNam="Name ="+name.split(" ")[0]+"   UserName ="+usNam+" UserPassword ";
    }

    public void setUsNam(){
        usNam=eMail.replaceAll("[@.]","");
    }

    public void setUserPsw(){
        count++;
        userPsw=""+mezuniyet+kayit+count;
    }

    public User(){
        NameControl nameObj=new NameControl();
        IdControl idObj=new IdControl();
        AddressInfoControl adresObj=new AddressInfoControl();
        EducationInfoControl eduInfoObj=new EducationInfoControl();

        this.name=nameObj.fullName;
        this.idTc=idObj.Id;
        this.eMail=adresObj.eMail;
        this.tlNo=adresObj.phoneNumber;
        this.kayit= eduInfoObj.registrationYear;
        this.mezuniyet= eduInfoObj.graduationYear;
        this.yas= eduInfoObj.age;
        setUsNam();
        setUserPsw();
        setUsLis();
        aLy();

    }


    public Map<String,String> aLy(){

        m.put(listNam,userPsw);
        return m;

    }


}
