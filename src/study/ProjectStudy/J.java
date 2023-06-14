package study.ProjectStudy;

public class J {
    public static void main(String[] args) {
        int x = 1;
        if(x==1){
            System.out.println(x);
        }
        System.out.println(x);  // 1

        for(int i=0; i<5; i++){
            if(i==1){
                System.out.print("J");
            }
            System.out.print(i);  // 1
        }
        System.out.println();

        for(int i= 0; i<5 ; i++){
            if(i==3){
                System.out.println(i);
                //break;
            }
            System.out.println(i);  // 1 no matter if condition satisfies or not this SOP will be executed and it doesn't act as else block
        }                         //but when we use break keyword it just exits the loop so the remaining code is not executed
    }                             //it doesn't mean, if condition is satisfied, so the remaining code acts as else code
}                                 //similarly when we use continue keyword it tells to stop further code execution and continue the loop.
