public class reversestring {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example input
        String input = "   the   sky   is  blue   ";
        String result = sol.reverseWords(input);

        // Print the result
        System.out.println("Input:  \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}

class Solution {
    public String reverseWords(String s) {
        // Remove leading/trailing spaces and normalize internal spaces
        s = s.trim().replaceAll("\\s+", " ");

        // Split into words
        String[] arr = s.split(" ");

        // Reverse the array
        int left = 0, right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Join back into a single string
        return String.join(" ", arr);
    }
}