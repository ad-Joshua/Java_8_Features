package study;

public class Loop {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6,7,8,9};
        for(int i= 0; i<x.length; i++){
            if(x[i]%2==0 || x[i]%3==0){
                System.out.println("Nums Divisible by 2 or 3:"+x[i]);
            }
//            if(x[i]%3==0){
//                System.out.println("Nums Divisible by 3:"+x[i]);
//            }
            else{
                System.out.println("Not Divisible:"+ x[i]);
            }
        }
    }
}
