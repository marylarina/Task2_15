package ru.vsu.cs.course1;


public class Task {
    public static String[] Swap(String[] s){
        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        //list.ArrayToLinkedList(s, list);
        for (int i=0; i<s.length;i++){
            if(i==0){
                list.addFirst(s[i]);
            }else {
                list.addLast(s[i]);
            }
        }
        list.Solution();
        return list.LinkedListToArray();
    }
}
