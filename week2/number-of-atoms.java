// Uses the multiset class in Multiset.java
class Solution {
    public String countOfAtoms(String formula) {
        Multiset<String> map = new Multiset<>();
        Stack<Integer> factors = new Stack<>();
        
        int count = 1;
        int factor = 1;
        String cstr = "";
        
        // Iterate backward
        for (int i = formula.length() - 1; i >= 0; i--) {
            char c = formula.charAt(i);
            if (Character.isUpperCase(c)) {
                count = cstr.isEmpty() ? 1 : Integer.parseInt(cstr);
                String element = String.valueOf(c);
                map.add(element, count * factor);
                cstr = "";
            } else if (Character.isLowerCase(c)) {
                count = cstr.isEmpty() ? 1 : Integer.parseInt(cstr);
                String element = formula.charAt(--i) + "" + c;
                map.add(element, count * factor);
                cstr = "";
            } else if (Character.isDigit(c)) {
                cstr = c + cstr;
            } else if (c == ')') {
                count = Integer.parseInt(cstr);
                factor *= count;
                factors.push(count);
                cstr = "";
            } else {
                factor /= factors.pop();
            }
        }

        List<String> s = new ArrayList<>();
        s.addAll(map.elementSet());

        // Sort list alphabetically
        Collections.sort(s);
        StringBuilder result = new StringBuilder();
        for (String str : s) {
            result.append(str + (map.count(str) > 1 ? map.count(str) : ""));
        }
        return result.toString();
    }
}