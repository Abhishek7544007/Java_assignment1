package java_assignment_Q3;

import java.util.*;

public class TrimString{
    static void listTrim(List<String> strings) {
        for (ListIterator<String> it = strings.listIterator(); it.hasNext(); ) {
            it.set(it.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" Welcome  ", "  to ", " the  ","world  ", "   of ","java ");
        listTrim(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}