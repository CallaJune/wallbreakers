class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        transformations = {}
        for word in words:
            morse_word = self.morsify(word)
            if morse_word in transformations:
                transformations[morse_word] += 1
            else:
                transformations[morse_word] = 1
        return len(transformations)

    def morsify(self, word: str) -> str:
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        res = []
        for c in word:
            res.append(morse[ord(c) - 97])
        return "".join(res)
