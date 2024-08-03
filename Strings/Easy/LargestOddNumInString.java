// Use the concept of substring
public class LargestOddNumInString {
    public String largestOddNumber(String num) {
        int size = num.length();
        if ((int) num.charAt(size - 1) % 2 == 1)
            return num;
        int i = size - 1;
        while (i >= 0) {
            int n = (int) num.charAt(i);
            if (n % 2 == 1)
                return num.substring(0, i + 1);
            i--;
        }
        return "";
    }
}
