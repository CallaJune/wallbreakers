class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> result; 
        for (int i = 1; i < n + 1; i++) {
            bool div_by_3 = i % 3 == 0;
            bool div_by_5 = i % 5 == 0;
            if (div_by_3 && div_by_5) {
                result.push_back("FizzBuzz");
            } else if (div_by_3) {
                result.push_back("Fizz");
            } else if (div_by_5) {
                result.push_back("Buzz");
            } else {
                result.push_back(to_string(i));
            }
        }
        return result;
    }
};
