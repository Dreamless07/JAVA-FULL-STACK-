class aboutstudent {//class
    private String Sname="Saad";
    private String Sbranch="CS";
    private String Srollno="022";
    private String Saddress="Lucknow";;//private variables

    public String getSname() {
        return Sname;//to access private var we use get() method /can also use a public method(performing encapsulation)
    }

    public void setSname(String Sname1) {
        this.Sname = Sname1;//to set different value to the var we use set() method
    }

    public String getSbranch() {
        return Sbranch;
    }

    public void setSbranch(String Sbranch1) {
        this.Sbranch = Sbranch1;
    }
    public String getSrollno() {
        return Srollno;
    }

    public void setSrollno(String Srollno1) {
        this.Srollno = Srollno1;
    }
    public String getSaddress() {
        return Saddress;
    }

    public void setSaddress(String Saddress1) {
        this.Saddress = Saddress1;
    }
}

public class getsetStandard {
    public static void main(String[] args) {
        aboutstudent obb=new aboutstudent();

        System.out.println("After Getter Method:\nName: "+obb.getSname()+"\nBranch: "+obb.getSbranch()+"\nRoll No: "+obb.getSrollno()+"\nAddress: "+obb.getSaddress());
        obb.setSname("Aftab");
        obb.setSbranch("AIML");
        obb.setSrollno("001");
        obb.setSaddress("Bengaluru");
        System.out.println("After Setter Method:\nName: "+obb.getSname()+"\nBranch: "+obb.getSbranch()+"\nRoll No: "+obb.getSrollno()+"\nAddress: "+obb.getSaddress());



    }
}
