package java;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-07-21
 */
class Solution {
    public static void main(String[] args) {
        System.out.println(this.isAnagram("abcd","dcba"));
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}