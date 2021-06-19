class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morseCode = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        result = set()
        for word in words:
            morseWord = ""
            for c in word:
                morseWord += morseCode[ord(c) - 97]
            result.add(morseWord)
        return len(result)