 package name.zhangmin.algorithm.leetcode;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 *
 * @author zhangmin.name
 * @date 2019/03/15
 */
public class ReverseString344 {
	public void reverseString(char[] s) {
		int lo = 0, hi = s.length - 1;
		char c = 0;
		while (lo < hi) {
			c = s[lo];
			s[lo] = s[hi];
			s[hi] = c;
			lo++;
			hi--;
		}
	}
}
