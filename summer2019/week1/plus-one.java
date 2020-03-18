class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        int[] output = new int[digits.length];
        int iterator = digits.length - 1;
        int carry = 1;
        while (iterator >= 0) {
            int added = digits[iterator] + carry;
            carry = 0;
            if (added >= 10) {
                carry = 1;
                added = 0;
            }
            output[iterator] = added;
            iterator--;
        }
        if (carry != 0) {
            int[] result = new int[output.length + 1];
            result[0] = carry;
            System.arraycopy(output, 0, result, 1, output.length);
            return result;
        }
        return output;
    }
}