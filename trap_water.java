
public class trap_water {

    private int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(lh, rh);
            max = Math.max(max, min_h * (r - l));

            if (lh < rh)
                l++;
            else
                r--;
        }

        return max;
    }

    public static void main(String[] args) {
        trap_water solution = new trap_water();

        // Example usage
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(heights1));

        int[] heights2 = {3, 1, 2, 4, 5};
        System.out.println(solution.maxArea(heights2));
    }
}

