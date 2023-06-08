package study.ProjectStudy;

public class StringBuild {
    public static void main(String[] args) {

        int id = 1;
        String name= "joshua";
        StringBuilder stringBuilder = new StringBuilder("Id:").append(id)
                .append("\nName:").append(name);  //String builder is not synchronised and String buffer is synchronised
        System.out.println(stringBuilder);
        String str = new StringBuilder("Id:").append(id)
                .append("\nName:").append(name).toString();  //here converting to toString so the return type will be String str
        System.out.println(str);
    }
}
