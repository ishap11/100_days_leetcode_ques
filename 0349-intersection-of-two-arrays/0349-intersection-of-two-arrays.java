import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j && !resultList.contains(i)) {
                    resultList.add(i);
                    break;
                }
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
