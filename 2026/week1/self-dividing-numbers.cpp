class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> result;
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                result.push_back(i);
            }
        }
        return result;
    }

    bool isSelfDividingNumber(int num) {
        int current = num;
        int remainder;
        while (current) {
            remainder = current % 10;
            if (remainder == 0 || num % remainder != 0) {
                return false;
            }
            current = floor(current / 10);
        }
        return true;
    }
};
