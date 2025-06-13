public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        int count1 = 0;
        int count2 = 0;
        boolean flag = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                for (int j = 0; j < s1.length(); j++) {
                    if (ch == s1.charAt(j)) {
                        count1++;
                    }
                }
                for (int k = 0; k < s2.length(); k++) {
                    if (s2.charAt(k) == ch) {
                        count2++;
                    }
                }
                if (count1 != count2) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("String is Anagram");
            } else {
                System.out.println("String is not Anagram");
            }
        } else {
            System.out.println("String length have not same");
        }
    }
}