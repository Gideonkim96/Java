import java.util.Arrays;

class Solution {
    public int[] solution(int[] A, int K) {
        int[] rotatedArray = new int[A.length];

        // If the array is empty or K is 0, return the original array
        if (A.length == 0 || K == 0) {
            return A;
        }

        // Calculate the effective number of rotations (K % array length)
        int rotations = K % A.length;

        // Copy the rotated elements to the rotated array
        for (int i = 0; i < A.length; i++) {
            int newIndex = (i + rotations) % A.length;
            rotatedArray[newIndex] = A[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        int[] A1 = {3, 8, 9, 7, 6};
        int K1 = 3;
        int[] result1 = solution.solution(A1, K1);
        System.out.println("Result 1: " + Arrays.toString(result1)); // Output: [9, 7, 6, 3, 8]

        int[] A2 = {0, 0, 0};
        int K2 = 1;
        int[] result2 = solution.solution(A2, K2);
        System.out.println("Result 2: " + Arrays.toString(result2)); // Output: [0, 0, 0]

        int[] A3 = {1, 2, 3, 4};
        int K3 = 4;
        int[] result3 = solution.solution(A3, K3);
        System.out.println("Result 3: " + Arrays.toString(result3)); // Output: [1, 2, 3, 4]
    }
}
