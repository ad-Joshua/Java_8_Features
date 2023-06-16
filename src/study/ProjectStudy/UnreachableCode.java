package study.ProjectStudy;

public class UnreachableCode {
    int x = 10;
    public static void main(String[] args) {
     UnreachableCode da = new UnreachableCode();
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
               return true;                          //If for loop doesn't exit in else and else has only return statement then the
           }                                         //"return false;" will become unreachable code
        }
        return false;
    }
}
