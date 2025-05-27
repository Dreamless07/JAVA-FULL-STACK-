interface College {
    public void BE(String CN, int years, float percentage);

    public void Inter(String CN, int years, float percentage);

    public void School(String CN, int years, float percentage);
}
class College1 implements College{
    public void BE(String CN, int years, float percentage) {
        System.out.println("College name:"+CN+"\nYears studied:"+years+"\nPercentage:"+percentage);
    }
    public void Inter(String CN, int years, float percentage) {
        System.out.println("College name:"+CN+"\nYears studied:"+years+"\nPercentage:"+percentage);
    }
    public void School(String CN, int years, float percentage) {
        System.out.println("College name:"+CN+"\nYears studied:"+years+"\nPercentage:"+percentage);
    }
}

public class CollegesPractice {
    public static void main(String[] args) {
        College1 Colob=new College1();
        Colob.BE("VVIT",4,85);
        Colob.Inter("Falcon",2,96);
        Colob.School("Gem School",10,92);
    }
}
