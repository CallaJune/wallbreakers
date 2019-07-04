// Uses the multiset class in Multiset.java
// 14/28 test cases
class Solution {
    public String countOfAtoms(String formula) {
        Multiset<String> elements = parseFormula(formula);
        // Create a sorted array of the elements in elements.elementSet()
        String[] items = new String[elements.elementSet().size()];
        int i = 0;
        for (String item : elements.elementSet()) {
            items[i++] = item;
        }
        Arrays.sort(items);
        StringBuilder result = new StringBuilder();
        // For each item in array, append item, count to result
        for (String item : items) {
            int count = elements.count(item);
            if (count == 1) {
                result.append(item);
            } else {
                result.append(item + count);   
            }
        }
        return result.toString();
    }
    
    public Multiset<String> parseFormula(String formula) {
        Multiset<String> elements = new Multiset<>();
        Stack<Multiset<String>> stack = new Stack<>();
        Multiset<String> map = new Multiset<>();
        StringBuilder s = new StringBuilder();
        // Iterate over formula
        int i = 0;
        int numParens = 0;
        while (i < formula.length()) {
            char c = formula.charAt(i);
            if (c == '(') {
                if (s.length() > 0) {
                    // Put current atom onto map
                    map.add(s.toString());
                    // Reset atom string builder s
                    s.setLength(0);   
                }
                // Put current map onto stack, empty map
                if (map.size() > 0) {
                    stack.push(map); 
                }
                map = new Multiset<String>(); 
                i++;
            } else if (c == ')') {
                // Clear s and if it exists
                if (s.length() > 0) {
                    // Put current atom onto map
                    map.add(s.toString());
                    // Reset atom string builder s
                    s.setLength(0);
                }
                // Put current map onto stack, empty map
                if (map.size() > 0) {
                    stack.push(map);
                }
                map = new Multiset<String>();
                numParens++;
                i++;
            } else if (Character.isDigit(c)) {
                // If s not empty, capture value
                String atom = s.toString();
                s.setLength(0);
                int num = 0;
                // Build number
                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                    s.append(formula.charAt(i));
                    i++;
                }
                num = Integer.parseInt(s.toString());
                s.setLength(0);
                // If s not empty, add s to map
                if (atom.length() > 0) {
                    // Put current atom onto map
                    map.add(atom, num);
                    // Clear s
                    s.setLength(0);
                } else {
                    ArrayList<Multiset<String>> list = new ArrayList<Multiset<String>>();
                    for (int p = 0; p < numParens; p++) {
                        // Multiply everything in stack top by num
                        if (stack.empty()) {
                            continue;
                        }
                        Multiset<String> mapToIncrement = stack.pop();
                        for (String atomName : mapToIncrement.elementSet()) {
                            mapToIncrement.setCount(atomName, 0, mapToIncrement.count(atomName) * num);
                        }
                        list.add(mapToIncrement);
                    }
                    // Push everything on arraylist to stack in reverse order
                    for (int it = list.size() - 1; it >= 0; it--) {
                        stack.push(list.get(it));
                    }
                }
            } else if (Character.isUpperCase(c)) {
                if (s.length() > 0) {
                    // Put current atom onto map
                    map.add(s.toString());
                    // Reset atom string builder s
                    s.setLength(0);   
                }
                // Initialize s with current
                s.append(c);
                i++;
            } else if (Character.isLowerCase(c)) {
                s.append(c);
                i++;
            }
        }
        
        // Add any trailing atom names
        if (s.length() > 0) {
            map.add(s.toString());
            s.setLength(0);
        }
        
        // Add contents of map to elements
        if (map.size() > 0) {
            for (String atomName : map.elementSet()) {
                elements.add(atomName, map.count(atomName));
            }
        }
        
        // Merge all multisets into elements
        while (!stack.empty()) {
            Multiset<String> setToMerge = stack.pop();
            for (String atomName : setToMerge.elementSet()) {
                elements.add(atomName, setToMerge.count(atomName));
            }
        }
        
        return elements;
    }
}