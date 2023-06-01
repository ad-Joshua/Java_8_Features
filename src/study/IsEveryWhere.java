package study;

public class IsEveryWhere {
    public static void main(String[] args) {
        int [] x = {1,2,3,2,1};
        var a = 1;
        for(int i=0; i<x.length-1; i++){
            if(x[i]==a || x[i+1]==a){
                System.out.println("1 is EveryWhere");


            }
        }
        int [] y = {1,2,3,4,5,6,7,8,9};
        for(int j=0; j<y.length; j++){
            if(y[j]%2==0){
                System.out.println(y[j]);
            }
        }
    }
}
