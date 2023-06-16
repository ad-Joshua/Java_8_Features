package study.ProjectStudy;

public class ConditionsStatement {
    int z =10;
    public static void main(String[] args) {
        boolean x = false;
        int y =2;  //put 1 or 2
        if (y==1){
            x=true;
        }else if (y==2) {          //else if/else
            x=false;
        }

        if(x){
            System.out.println("x is "+ x);   //both If runs even after if-else
        }
        if(!x){
            System.out.println("x is "+ x);
        }
    }
}
