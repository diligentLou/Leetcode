package Leetcode4;

/**
 * Created by DELL on 2018/3/28.
 * Median of Two Sorted Arrays
 * 有两个大小分别为m和n的排序数组nums1和nums2。
 * 查找两个排序数组的中位数。总的运行时间复杂度应该是O（log（m + n））。
 * nums1 = [1,3]
 * nums2 = [2]
 * 中位数是2.0
 *
 * nums1 = [1,2]
 *nums2 = [3,4]
 *中位数是（2 + 3）/ 2 = 2.5
 *
 * 思路:
 * 对于一个长度为n的已排序数列a，若n为奇数，中位数为a[n / 2 + 1] ,
    若n为偶数，则中位数(a[n / 2] + a[n / 2 + 1]) / 2
    如果我们可以在两个数列中求出第K小的元素，便可以解决该问题
    不妨设数列A元素个数为n，数列B元素个数为m，各自升序排序，求第k小元素
    取A[k / 2] B[k / 2] 比较，
     如果 A[k / 2] > B[k / 2] 那么，所求的元素必然不在B的前k / 2个元素中(证明反证法)
    反之，必然不在A的前k / 2个元素中，于是我们可以将A或B数列的前k / 2元素删去，求剩下两个数列的
    k - k / 2小元素，于是得到了数据规模变小的同类问题，递归解决
    如果 k / 2 大于某数列个数，所求元素必然不在另一数列的前k / 2个元素中，同上操作就好。
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return  -1;
    }
}
