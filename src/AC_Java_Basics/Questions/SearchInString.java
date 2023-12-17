package AC_Java_Basics.Questions;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="Swayam";
        char targetchar='a';
        System.out.println(search(name,targetchar));
        System.out.println(Arrays.toString(name.toCharArray()));//useful
    }

    private static boolean search(String name,char targetchar) {
        if(name.length()==0){//length is a method
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(targetchar==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
