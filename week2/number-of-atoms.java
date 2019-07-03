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
        // For each item in array, append item, elements.count(element) to result
        for (String item : items) {
            result.append(item + elements.count(item));
        }
    }
    
    public Multiset<String> parseFormula(String formula) {
        Multiset<String> elements = new Multiset<>();
        
    }
}