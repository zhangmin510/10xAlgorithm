 package name.zhangmin.algorithm.string;

import java.util.Arrays;

/**
 * @author zhangmin.name
 * @date 2019/03/12
 */
public class TrimPlus {

	public char[] trim(char[] target) {
		if (target == null || target.length == 0) {
			return target;
		}

		int len = target.length;
		int i = 0, j = 0;

		while (i < len) {
			target[j++] = target[i];
			if (target[i] != '*') {
				i++;
			} else {
				while (i < len && target[i] == '*') {
					i++;
				}
			}
		}
		return target;
	}

	public static void swap(char[] target, int i, int j) {
		char c = target[i];
		target[i] = target[j];
		target[j] = c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c1 = new char[] {'a', '*', '*', 'b', 'c', '*', 'e'};

		System.out.println("before: " + Arrays.toString(c1));

		char[] ret = new TrimPlus().trim(c1);

		System.out.println("after: " + Arrays.toString(ret));
	}

}
