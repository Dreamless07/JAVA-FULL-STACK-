import java.io.FileOutputStream;
public class writingToFile2 {
    public static void main(String[] args) {
        String assign="testing.txt";//existing file
        String content="hello i added the extra content through the 2nd way";//add the info
        try(FileOutputStream objfos=new FileOutputStream(assign)){
            byte[] newbyte=content.getBytes();//get byte
            objfos.write(newbyte);//write into the file through object
            System.out.println("Inserted the content into the file");
            objfos.close();//close the file
        }
        catch (Exception e){
            System.out.println("Cannot create file");
        }
    }
}
