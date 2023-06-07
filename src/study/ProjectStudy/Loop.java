package study.ProjectStudy;

public class Loop {
    public static void main(String[] args) {
        String s1 = "";

        int [] x = {2};  //try with 1 and 2 separately
        for (int i = 0; i<x.length; i++){
            if(x[i]%2==0){
                s1 += "true";
            }else{
                s1 += "false";
            }
            if(x[i]%1==0){
                s1 += "2true";
            }
            if(x[i]!=0){
                s1 += "3true";
            }
            System.out.println(s1);
        }
    }
}
