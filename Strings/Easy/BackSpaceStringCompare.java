public class BackSpaceStringCompare {
    private String actualString(String str) {
        StringBuilder sb = new StringBuilder();
        int hashCount = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                hashCount++;
                continue;
            }
            if (hashCount > 0) {
                hashCount--;
            } else {
                sb.insert(0, str.charAt(i));
            }
        }
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        boolean bool = actualString(s).equals(actualString(t));
        return bool;
    }

}