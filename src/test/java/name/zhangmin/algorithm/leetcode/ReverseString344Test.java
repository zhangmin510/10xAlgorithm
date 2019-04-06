 package name.zhangmin.algorithm.leetcode;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


/**
 * Test <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 * @author zhangmin.name
 * @date 2019/03/15
 */
public class ReverseString344Test {

	@Test
	public void testReverseString() {
		String s = "abc";
		char[] str = s.toCharArray();
		char[] target = new char[] {'c', 'b', 'a'};
		ReverseString344 rs = new ReverseString344();
		System.out.println("before: " + Arrays.toString(str));
		rs.reverseString(str);
		System.out.println("after: " + Arrays.toString(str));
		assertEquals(true, Arrays.equals(target, str));
	}
}
