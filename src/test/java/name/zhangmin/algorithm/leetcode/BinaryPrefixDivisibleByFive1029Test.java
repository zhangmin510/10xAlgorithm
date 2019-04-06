package name.zhangmin.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryPrefixDivisibleByFive1029Test {
    BinaryPrefixDivisibleByFive1029 obj = new BinaryPrefixDivisibleByFive1029();

    @Test
    public void normalTest() {
        int[] nums = new int[]{0,1,1};

        List<Boolean> exp = new ArrayList<>();
        exp.add(true);
        exp.add(false);
        exp.add(false);

        List<Boolean> ret = obj.prefixesDivBy5(nums);
        boolean matched = true;
        for (int i = 0; i < exp.size(); i++) {
            if (exp.get(i).booleanValue() != ret.get(i).booleanValue()) {
                matched = false;
            }
        }
        Assert.assertTrue("result should equal", matched);
    }
}