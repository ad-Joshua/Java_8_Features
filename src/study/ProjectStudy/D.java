package study.ProjectStudy;

public class D {
    int x = 10;
    public static void main(String[] args) {
     D da = new D();
        boolean t1 = da.test();
        System.out.println(t1);

    }

    public boolean test(){
        if(x>10){
            return true;
        }else if (x>11){
            return true;
        }else{
           for(int i=0; i<=9; i++){
               if(i==x)
               return true;
           }
        }
        return false;
    }
}
