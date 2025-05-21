class company {//CLASS
    String Name;
    String Role;
    int Salary;

    company(String empname, String emprole, int empsalary) {//CONSTRUCTOR
        Name = empname;
        Role = emprole;
        Salary = empsalary;
    }
    public void print(){
        System.out.println("The name of the employee is "+Name+", his role is "+Role+" and his salary is "+Salary);
    }
}
public class practice {
    public static void main(String[] args) {
        company obj = new company("Saad", "Junior Dev", 50000);
        obj.print();//CALL METHOD
    }
}
