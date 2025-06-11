import java.io.FileReader;//inbuilt library
public class readFile {
    public static void main(String[] args) throws Exception {
        String newstr="testing.txt";
        int readChar;
        try(FileReader reader=new FileReader(newstr)){
            while((readChar=reader.read())!=-1){//read every char till end
                System.out.println((char)readChar);//explicit typecasting from int to char
            }
        }
        catch(Exception e){
            System.out.println(newstr);
        }
    }
}