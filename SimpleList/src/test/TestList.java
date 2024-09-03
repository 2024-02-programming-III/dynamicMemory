package test;
import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.utils.dynamic.SimpleList;

public class TestList {
    private List<Integer> list1;
    private List<Integer> list2;

    public void testArrayList(List<Integer> list, List<Integer> list2) {
        this.list1 = list;
        this.list2 = list2;
        loadDataArrayList();
    }

    public void loadDataArrayList() {
        list1 = new SimpleList<>();
        list2 = new ArrayList<>();
        for (int i = 0; i < 300000; i++) {
            int rand = (int) (Math.random() * 100000);
            list2.add(rand);
            list1.add(rand);
        }
    }

    public List<Integer> getList1() {
        return list1;
    }

    public List<Integer> getList2() {
        return list2;
    }
}
