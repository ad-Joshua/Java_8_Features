package study.ProjectStudy;

public class ReturnContinueBreak {
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
                System.out.println(i);  //op is 0,1,2,3,3,4 so even though if is satisfied remaining code runs.
                //break;
            }
            System.out.println(i);  // 1 no matter if condition satisfies or not this SOP will be executed and it doesn't act as else block
        }                         //but when we use break keyword it just exits the loop so the remaining code is not executed
    }                             //it doesn't mean, if condition is satisfied, so the remaining code acts as else code
}                                 //similarly when we use continue keyword it tells to stop further code execution and continue the loop.

//1st code:
//        if(!escreeningProperties= getAutoSaveDelete()){
//        result.put("hashError", "true");
//        return result;
//        }
//        result = autoDeleteSaveAssessmentScheduler.runJob();
//        return result;
//        ----------------------------------------------------------------------
//
//        2nd code:
//        if(includeAll){
//        userStatusIdList.add(UserStatusEnum.DELETED.getUsersStatusId());
//        }
//        List<DropDownObj> dropDownObj = programServices.getProgramDropDownObjs(escreenUser.getProgramIdList());
//        return dropDownObjectList;

//in the 1st code if, the if condition is satisfied, then the remaining code will not be executed
//so this doesn't mean the 1st code acts as if-else block, it actually means by using return statement
//the early exit from method takes place so the remaining code doesn't run, similar to break and continue keywords in above example.
// but in 2nd code if, the no mater whether if condition is satisfied or not the remaining code runs.