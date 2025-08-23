class Solution {
    private boolean canAllocate(int[] arr, int k, int limit) {
        int students = 1, pages = 0;
        for (int a : arr) {
            if (a > limit) return false;
            if (pages + a > limit) {
                students++;
                pages = a;
                if (students > k) return false;
            } else {
                pages += a;
            }
        }
        return true;
    }

    public int findPages(int[] arr, int k) {
        if (k > arr.length) return -1;

        int low = 0, high = 0;
        for (int a : arr) {
            low = Math.max(low, a);
            high += a;
        }

        while (low < high) {
            int mid = (low + high) / 2;
            if (canAllocate(arr, k, mid)) high = mid;
            else low = mid + 1;
        }

        return low;
    }
}