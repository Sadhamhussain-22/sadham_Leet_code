class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;

        for (int i : count) {
            length += (i / 2) * 2;
        }

        return length < s.length() ? length + 1 : length;
    }
}