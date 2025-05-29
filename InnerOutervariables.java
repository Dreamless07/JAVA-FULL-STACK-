class outernew{//outer class
    private int a=10;//private var
    class innernew{//inner nested class
        public int printer(){
            return a;
        }
    }
}

public class InnerOutervariables {
    public static void main(String[] args) {
        outernew outerobj= new outernew();//for outer class
        outernew.innernew innerobj=outerobj.new innernew();//for accessing private variable
    }
}
