import java.util.HashMap;
/**
 * 
 * @author xiefeng
 *	最长的子串不重复的字符
 *	给定"pwwkew"的答案是"wke"，长度为3.请注意，答案必须是子字符串，"pwke"是子序列，而不是子字符串。
 */
public class Solution3 {
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		int len = 0;
		int last = -1;
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < chars.length; i++) {
			Integer at = map.get(chars[i]);
			if(at==null){
				len++;
				map.put(chars[i], i);
			}else{
				if(len>max){
					max = len;
				}
				len = i-at;
				int y = at;
				while(y>last){
					map.remove(chars[y]);
					y--;
				}
				map.put(chars[i], i);
				last = at;
			}
		}
		if(len>max){
			max = len;
		}
        return max;
    }
	public static void main(String[] args) {
		String s = "pwwkew";
		int l = new Solution3().lengthOfLongestSubstring(s);
		System.out.println(l);
		
	}
}
