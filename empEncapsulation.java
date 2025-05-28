class empDetails{
    private String emp_name = "Saad";
    private int emp_id = 1024;//private variables
    private int emp_salary = 50000;
    public String getEmp_name() {
        return emp_name;//get the value by get() method
    }
    public void setEmp_name(String emp_name1) {
        this.emp_name = emp_name1;//to set different value to var we use set() method
    }
    public int getEmp_id () {
        return emp_id;
    }
    public void setEmp_id(int emp_id1) {
        this.emp_id = emp_id1;
    }
    public int getEmp_salary () {
        return emp_salary;
    }

    public void setEmp_salary(int emp_salary1) {
        this.emp_salary = emp_salary1;
    }
}


public class empEncapsulation {
    public static void main(String[] args) {
        empDetails empob=new empDetails();
        empob.getEmp_name();
        empob.getEmp_id();
        empob.getEmp_salary();
        System.out.println("name:"+empob.getEmp_name()+"\nid:"+empob.getEmp_id()+"\nsalary:"+empob.getEmp_salary());
        empob.setEmp_name("john");
        empob.setEmp_id(520);
        empob.setEmp_salary(55000);//update values
        System.out.println("name:"+empob.getEmp_name()+"\nid:"+empob.getEmp_id()+"\nsalary:"+empob.getEmp_salary());
    }

}
