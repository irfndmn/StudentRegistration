package studentRegistration;

public class NameControl {
    public String fullName;


    public NameControl(){
        fullName();
    }

    public String fullName() {
        FirstNameController namObj=new FirstNameController();
        SecondNameController secObj=new SecondNameController();
        LastNameController lastObj=new LastNameController();



            fullName = namObj.firstNam + " " + secObj.secondNam + " " + lastObj.lastNam;
            fullName = fullName.replaceAll("\\s+", " ");

            return fullName;
        }



    }
