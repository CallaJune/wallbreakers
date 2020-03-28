class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morse = [
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--..",
        ]
        reps = set()
        for w in words:
            rep = ""
            for c in w:
                rep += morse[ord(c) - 97]
            reps.add(rep)
        return len(reps)
