package day3;

public class StringModify {

    // Task : kelimenin ilk 2 harf icerisinde A varsa silinsin (kelime içindeki harflerin hepsi büyük olacak)
    public String stringModify1(String str) {
        if (str.length() < 2) return str.replaceAll("A", "");
        return str.substring(0, 2).replaceAll("A", "") + str.substring(2);
    }


}
