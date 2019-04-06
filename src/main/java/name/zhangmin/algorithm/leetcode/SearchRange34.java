package name.zhangmin.algorithm.leetcode;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">
 *     34. Find First and Last Position of Element in Sorted Array</a>
 * @author zhangmin.name
 * @date 2019/03/30
 */
public class SearchRange34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[] {-1, -1};

        // find leftmost
        int lo = 0, len = nums.length, hi = len - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (nums[mid] < target) {
                lo = mid + 1;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] != target) {
                    ret[0] = mid;
                    break;
                } else {
                    hi = mid - 1;
                }
            }
        }

        if (ret[0] == -1) {
            return ret;
        }

        // find rightmost
        lo = ret[0];
        hi = len - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (nums[mid] < target) {
                lo = mid + 1;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    ret[1] = mid;
                    break;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return ret;
    }
}
