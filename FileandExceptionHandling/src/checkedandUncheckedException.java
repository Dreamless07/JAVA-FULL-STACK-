//exceptions
import java.io.File;
import java.io.FileReader;
public class checkedandUncheckedException {
    public static void main(String[] args) throws Exception{
        File fileobject = new File("abc.txt");//file not there
        FileReader readobject=new FileReader(fileobject);//file missing or not found exception(checked/compile time)
        int arraystore[]={1,2,3,4};//array size only 4
        System.out.println(arraystore[5]);//array index out of bound exception(unchecked/runtime)
    }
}
