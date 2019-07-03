# Wallbreakers Assignment Week #2 (due by EOD Friday, July 5th)

## Goals For This Week
Hash maps and hash sets are arguably the most important data structures you will need for coding interviews, as you might have noticed this during our first mock interview. They come up all the time either directly, or indirectly (say as part of memorization, building a graph, etc.). This week we want to make sure you are very comfortable using hash maps and hash sets in your language of choice. You should be able to use them without needing to try to remember or look up the right API or syntax. We will also look at multisets which are a special type of hash maps used for counting occurrences of objects.

## Week 2 Checklist
- Solve as many of the problems listed below as you can by EOD Friday, July 5th.
- Complete the [weekly progress report](https://forms.gle/svryhNANMeCcKxE17) form by EOD Friday, July 5th.

## Week #2 Coding Exercises

### Hash maps and hash sets
- [x] [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/) ([Solution](jewels-and-stones.java))
- [x] [Unique Morse Code Words](https://leetcode.com/problems/unique-morse-code-words/) ([Solution](unique-morse-code-words.java))
- [x] [Happy Number](https://leetcode.com/problems/happy-number/) ([Solution](happy-number.java))
- [x] [Uncommon Words from Two Sentences](https://leetcode.com/problems/uncommon-words-from-two-sentences/) ([Solution](uncommon-words-from-two-sentences.java))
- [x] [Distribute Candies](https://leetcode.com/problems/distribute-candies/) ([Solution](distribute-candies.java))
- [x] [Groups of Special Equivalent Strings](https://leetcode.com/problems/groups-of-special-equivalent-strings/) ([Solution](groups-of-special-equivalent-strings.java))
- [x] [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) ([Solution](intersection-of-two-arrays.java))
- [x] [Validate Sudoku](https://leetcode.com/problems/valid-sudoku/) ([Solution](valid-sudoku.java))
- [x] [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) ([Solution](isomorphic-strings.java))
- [x] [Word Pattern](https://leetcode.com/problems/word-pattern/) ([Solution](word-pattern.java))
- [x] [Design Hashmap](https://leetcode.com/problems/design-hashmap/) ([Solution](design-hashmap.java))
- [x] [Design Hashset](https://leetcode.com/problems/design-hashset/) ([Solution](design-hashset.java))

### Multisets
- [ ] [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
	- Note: Use a multiset for this one. You can also solve it without using one. How? Try to solve it both ways. How do the two solutions compare?
- [x] [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) ([Solution](first-unique-character-in-a-string.java))
- [ ] [Subdomain Visit Count](https://leetcode.com/problems/subdomain-visit-count/)
- [x] [Find the Difference](https://leetcode.com/problems/find-the-difference/) ([Solution](find-the-difference.java))
- [ ] [Most Common Word](https://leetcode.com/problems/most-common-word/)
- [x] [Sort Characters by Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) ([Solution](sort-characters-by-frequency.java))
- [x] [Set Mismatch](https://leetcode.com/problems/set-mismatch/) ([Solution](set-mismatch.java))
	- Note: This one has a few “clever” solutions but feel free to use a simple multiset solution.
- [ ] [Number of Atoms](https://leetcode.com/problems/number-of-atoms/) 
	- Note: This one is more difficult than the average interview question but it is good exercise! You will need to build a simple parser in addition to using a multiset.

### Tries
- [ ] [Longest Word in a Dictionary](https://leetcode.com/problems/longest-word-in-dictionary)
- [ ] [Implement Trie Prefix Tree](https://leetcode.com/problems/implement-trie-prefix-tree)
- [ ] [Word Search II](https://leetcode.com/problems/word-search-ii)

## Resources
- Python Resources
	- [Tutorial on dictionaries in Python (hash maps)](https://www.datacamp.com/community/tutorials/python-dictionary-tutorial)
	- [Bonus: Learn how and when to use defaultdict in Python to speed up your coding](https://www.accelebrate.com/blog/using-defaultdict-python/)
	- [Tutorial on sets in Python (hash sets)](https://www.datacamp.com/community/tutorials/sets-in-python)
	- [Multisets in Python: The collections.Counter class](https://pymotw.com/2/collections/counter.html)
		- This is a very powerful class to know how to use. Some interview problems can be solved in only a few lines of code if you know how to use this class. Make sure you know how it works and that you could implement an equivalent class if needed. A good exercise would be to implement your own Counter class that imitates collections. Counter using a dictionary as the underlying structure.
- Java Resources
	- [HashMap in Java](https://www.callicoder.com/java-hashmap/)
	- [HashSet in Java](https://www.baeldung.com/java-hashset)
	- Multisets: Unfortunately Java does not come with a multiset class. You will have to use a HashMap<T, Integer> and manually implement any of the multiset operations you need. (For real-world applications, you can use Google's Guava library which comes with a [multiset class](https://guava.dev/releases/16.0/api/docs/com/google/common/collect/Multiset.html) but I do not recommend using this for coding interviews as interviewers are likely to be unfamiliar with it, and you are generally expected to only use standard language features and libraries only.)
- Tries
	- [Trie Insert and Search](https://www.geeksforgeeks.org/trie-insert-and-search/)
	- [A Simpler Way to Implement Trie Data Structure](https://medium.com/@info.gildacademy/a-simpler-way-to-implement-trie-data-structure-in-python-efa6a958a4f2)