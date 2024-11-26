class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sol = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) sol.append(word1.charAt(i));
            if (i < word2.length()) sol.append(word2.charAt(i));
            i++;
        }
        return sol.toString();
    }
}
