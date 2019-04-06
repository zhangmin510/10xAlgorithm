package name.zhangmin.algorithm.math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zhangmin
 * @date 2019/4/6
 */
public class Recursion {
    public static long[] REWARDS = {1, 2, 5, 10};

    /**
     * 假设有四种面额的钱币，1 元、2 元、5 元和 10 元，而您一共给我 10 元，
     * 那您可以奖赏我 1 张 10 元，或者 10 张 1 元，或者 5 张 1 元外加 1
     * 张 5 元等等。如果考虑每次奖赏的金额和先后顺序，那么最终一共有多少种
     * 不同的奖赏方式呢？
     *
     * @param totalReward
     * @param result
     */
    public static void getRewardMethod(long totalReward, ArrayList result) {
        if (totalReward == 0) {
            // 递归结束，输出结果
            System.out.println(result);
            return;
        }

        if (totalReward < 0) {
            return;
        }

        for (int i = 0; i < REWARDS.length; i++) {
            ArrayList newResult = (ArrayList)(result.clone());
            newResult.add(REWARDS[i]);// 记录当前选择
            // 解决子问题
            getRewardMethod(totalReward - REWARDS[i], newResult);
        }
    }

    /**
     * 一个整数可以被分解为多个整数的乘积，例如，6 可以分解为 2x3。请使用递归编程的方法，
     * 为给定的整数 n，找到所有可能的分解（1 在解中最多只能出现 1 次）。例如，输入 8，
     * 输出是可以是 1x8, 8x1, 2x4, 4x2, 1x2x2x2, 1x2x4, ……
     * @param n
     */
    public static void integerFactorization(int n, ArrayList<Integer> result) {
        if (n == 1) {
            // 判断1是否在
            if (!result.contains(1)) {
                result.add(1);
            }
            System.out.println(result);
            return;
        }

        for (int i = 1; i <= n; i++) {
            // 1只能出现一次
            if (i == 1 && result.contains(1)) {
                continue;
            }
            ArrayList newResult = (ArrayList<Integer>)(result.clone());
            newResult.add(i);
            // 剪枝
            if (n % i != 0) {
                continue;
            }
            integerFactorization(n / i, newResult);
        }
    }

    public static int[] mergeSort(int[] nums) {
        if (nums == null) {
            return new int[0];
        }

        // 子数组只剩一个元素了，直接返回该数组
        if (nums.length == 1) {
            return nums;
        }

        // 将数组分为两半
        int mid = nums.length >> 1;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        // 嵌套调用，处理两个子数组
        left = mergeSort(left);
        right = mergeSort(right);

        // 合并两个已经排好序的数组
        int[] merged = merge(left, right);

        return merged;
    }

    private static int[] merge(int[] left, int[] right) {
        if (left == null) {
            left = new int[0];
        }
        if (right == null) {
            right = new int[0];
        }

        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // 合并两个数组
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        // 直接拷贝剩余的数组
        if (i < left.length) {
            for (int m = i; m < left.length; m++) {
                merged[k] = left[m];
                k++;
            }
        }

        if (j < right.length) {
            for (int m = j; m < right.length; m++) {
                merged[k] = right[m];
                k++;
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        Recursion.getRewardMethod(10, new ArrayList<Long>());

        System.out.println("=======IntegerFactorization======");
        Recursion.integerFactorization(8, new ArrayList<Integer>());
        System.out.println("=======IntegerFactorization======");

        int[] nums = new int[] {1, 9, 2, 8, 10, 3};
        System.out.println(Arrays.toString(Recursion.mergeSort(nums)));
    }
}
