package name.zhangmin.algorithm.math;

/**
 * @author zhangmin
 * @date 2019/4/6
 */
public class IterativeMethod {

    public static long getNumberOfWheat(int grid) {
        long sum = 0;
        long numberOfWheatInGrid = 0;

        numberOfWheatInGrid = 1;
        sum += numberOfWheatInGrid;

        // f(n) = f(n-1) * 2
        // f(1) = 1
        for (int i = 2; i <= grid; i++) {
            numberOfWheatInGrid *= 2;
            sum += numberOfWheatInGrid;
        }

        return sum;
    }

    /**
     * 二分法求一个证书的平方根。
     *
     * @param n 待求平方根的正整数
     * @param deltaThreshold 误差的阈值，或精度，近似解即可，否则需要耗费大量的时间和计算资源
     * @param maxTry 最大查找次数，防止死循环
     * @return 该正整数的平方根
     */
    public static double sqrt(int n, double deltaThreshold, int maxTry) {
        if (n <= 1) {
            throw new IllegalArgumentException("n must greater than 1");
        }

        if (maxTry <= 0) {
            throw new IllegalArgumentException("maxTry must greater than 0");
        }

        double lo = 1.0, hi = (double) n;
        for (int i = 0; i < maxTry; i++) {
            double mid = (lo + hi) / 2;
            double square = mid * mid;
            // (square - n) / n 
            double delta = Math.abs((square / n) - 1);

            if (delta <= deltaThreshold) {
                return mid;
            } else {
                if (square > n) {
                    hi = mid;
                } else {
                    lo = mid;
                }
            }
        }
        return -1.0;
    }

    public static void main(String[] args) {
        System.out.println("No. 63 = " + IterativeMethod.getNumberOfWheat(63));

        System.out.println("Square of 10 = " + IterativeMethod.sqrt(10, 0.0000001, 10_000));
    }
}
