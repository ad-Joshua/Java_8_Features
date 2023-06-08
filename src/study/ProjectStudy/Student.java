package study.ProjectStudy;

public enum Student {
    STUDENT_DETAILS( 1, "Joshua");

    private int id;
    private String name;

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
