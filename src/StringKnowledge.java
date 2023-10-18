public class StringKnowledge {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
        System.out.println(endOther("abc", "xyz"));
        System.out.println(endOther("abc", "hiabchi"));
        System.out.println();
        System.out.println(findRepeats("abba"));
        System.out.println(findRepeats("abaaba"));
        System.out.println(findRepeats("I love hams in the desert. Just love eating a ham"));
        System.out.println(findRepeats("abab"));
    }
    public static Boolean endOther(String before, String after) {
        before = before.toLowerCase();
        after = after.toLowerCase();
        int lengthBefore = before.length();
        int lengthAfter = after.length();
        if (lengthAfter > lengthBefore) {
            int newLength = lengthAfter - lengthBefore;
            String substring = after.substring(newLength);
            if (substring.contains(before)) {
                return true;
            }
            else { return false; }
        }
        if (lengthBefore >lengthAfter) {
            int newLength = lengthBefore - lengthAfter;
            String substring = before.substring(newLength);
            if (substring.contains(after)) {
                return true;
            }
            else { return false; }
        }
        return false;
    }
    public static boolean findRepeats(String string) {
        int length = string.length();
        for (int i = 0; i < length - 1; i++) {
            int iPlusTwo = i + 2;
            String substring = string.substring(i, iPlusTwo);
            String newString = string.replaceFirst(substring, "");
            if (newString.contains(substring)) {
                return true;
            }
        }
        return false;
    }
}

