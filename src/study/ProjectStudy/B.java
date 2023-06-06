package study.ProjectStudy;

import java.util.ArrayList;

public class B<T> {
    private ArrayList<A> listA;
    private int totalRecords;

    public ArrayList<A> getListA() {
        return listA;
    }

    public void setListA(ArrayList<A> listA) {
        this.listA = listA;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }
}
