package 字符串;

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 * 
 * @author MJ
 *
 */
public class _242_有效的字母异位词 {
	// s == anagram
    public boolean isAnagram(String s, String t) {
    	if (s == null || t == null) return false;
    	char[] schars = s.toCharArray();
    	char[] tchars = t.toCharArray();
    	if (schars.length != tchars.length) return false;
    	
    	int[] counts = new int[26];
    	for (int i = 0; i < schars.length; i++) {
			counts[schars[i] - 'a']++;
		}
    	
    	for (int i = 0; i < tchars.length; i++) {
    		if (--counts[tchars[i] - 'a'] < 0) return false;
		}
    	return true;
    	
    	/*
    	 counts['a' - 'a'] = -1
    	 counts['g' - 'a'] = 1
    	 counts['r' - 'a'] = 1
    	 counts['n' - 'a'] = 1
    	 counts['m' - 'a'] = 1
    	 counts[other] = 0
    	 */
    	
    	
    	
//    	// 字符a的数量
//    	counts[0] = xx;
//    	// 字符b的数量
//    	counts[1] = xx;
//    	// 字符c的数量
//    	counts[2] = xx;
//    	...
//    	// 字符z的数量
//    	counts[25] = xx;
    	
    	
    }
}
