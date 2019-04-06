package name.zhangmin.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SearchRange34Test {
    SearchRange34 sr = new SearchRange34();

    @Test
    public void normalTest() {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] ret = new int[]{3, 4};

        Assert.assertArrayEquals("ret should equal", ret, sr.searchRange(nums, target));
    }

    @Test
    public void notFoundTest() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] ret = new int[]{-1, -1};

        Assert.assertArrayEquals("ret should equal", ret, sr.searchRange(nums, target));
    }
}