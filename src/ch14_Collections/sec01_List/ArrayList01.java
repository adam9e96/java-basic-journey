package ch14_Collections.sec01_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("구마유시");
        arrayList.add("켈린");
        arrayList.add("케리아");
        System.out.println(arrayList);

        for (String s : arrayList) {
            System.out.print(s + "\t");
        }
        System.out.println("\n=====");
        Iterator<String> it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
