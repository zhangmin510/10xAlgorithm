package name.zhangmin.algorithm.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/contest/weekly-contest-130/problems/binary-prefix-divisible-by-5/">
 *     1029. Binary Prefix Divisible By 5</a>
 * @author zhangmin.name
 * @date 2019/03/31
 */
public class BinaryPrefixDivisibleByFive1029 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> answer = new ArrayList<Boolean>(A.length);
        if (A == null || A.length < 1) {
            return answer;
        }
        BigInteger value = BigInteger.ZERO;
        BigInteger five = BigInteger.valueOf(5L);
        for (int i = 0; i < A.length; i++) {
            value = value.multiply(BigInteger.valueOf(2L)).add(BigInteger.valueOf(A[i]));
            if (value.mod(five).compareTo(BigInteger.ZERO) == 0) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }
        return answer;
    }
}
