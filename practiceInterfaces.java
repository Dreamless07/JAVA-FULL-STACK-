interface Pet{
    public void Dog(String petname, String petbreed, String petcolour);
    public void Cat(String petname, String petcolour);
}
class NewPet implements Pet{
    public void Dog(String petname, String petbreed, String petcolour){
        System.out.println("Name:"+petname+"\nBreed:"+petbreed+"\nColour:"+petcolour);
    }
    public void Cat(String petname, String petcolour){
        System.out.println("Name:"+petname+"\nColour:"+petcolour);
    }
}

public class practiceInterfaces {
    public static void main(String[] args) {
        NewPet newobj= new NewPet();
        newobj.Dog("Bob","Pug","Brown");
        newobj.Cat("Tom","White");
    }
}
