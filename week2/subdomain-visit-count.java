// Uses the multiset class in Multiset.java
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Multiset<String> domains = new Multiset<>();
        for (String domain : cpdomains) {
            // Separate the subdomain from its count
            String[] pieces = domain.split(" ");
            int count = Integer.parseInt(pieces[0]);
            // Put each subdomain into domains with the value count
            String subdomain = pieces[1];
            // Add toplevel subdomain to domains
            domains.add(subdomain, count);
            // While subdomain can be broken down, continue to add
            // domains to multiset domains
            while (findInString(subdomain, '.') >= 0) {
                subdomain = subdomain.substring(findInString(subdomain, '.') + 1);
                domains.add(subdomain, count);
            }
        }
        List<String> result = new ArrayList<String>();
        for (String domain : domains.elementSet()) {
            result.add(String.valueOf(domains.count(domain)) + " " + domain);
        }
        return result;
    }
    
    // Returns first index in s where c occurs
    // or -1 if c is not found in s
    public int findInString(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}