interface prac {   //interface
    void add(Integer a, Integer b);//remember! should either use different vars or different interface for multiple methods and parameters in lambda
    //void sub(Integer a, Integer b);
    //void mul(Integer a, Integer b);
}


       /*
        class oper implements prac{
            public void add(Integer a, Integer b){
                System.out.println(a+b);
            }
            public void sub(Integer a, Integer b) {                  //for normal class and method
                System.out.println(a-b);
            }
            public void mul(Integer a, Integer b){
                System.out.println(a/b);
            }
        }
        */


public class practiceFeatures {
    public static void main(String[] args) {


        //oper newName=new oper();
        //newName.add(2,4);
        //newName.sub(3,4);                                             //for normal class and method
        //newName.mul(5,1);


        prac anon=(a,b) -> System.out.println(a+b);
        anon.add(1,4);                                            //for lambda function


        /*
        prac anon=new prac() {
            @Override
            public void add(Integer a, Integer b) {
                System.out.println(a+b);
            }

            @Override
            public void sub(Integer a, Integer b) {                      //for anonymous class
                System.out.println(a-b);
            }

            @Override
            public void mul(Integer a, Integer b) {
                System.out.println(a*b);
            }
        };
        anon.add(1,3);
        anon.sub(3,5);                                                  //for anonymous class
        anon.mul(3,8);
         */
    }
}
