class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        counts = defaultdict(int)
        for cpdomain in cpdomains:
            pieces = cpdomain.split(' ')
            times = int(pieces[0])
            domain_pieces = pieces[1].split('.')
            last = len(domain_pieces)
            first = 0
            while first < last:
                domain = '.'.join(domain_pieces[first:last])
                counts[domain] += times
                first += 1
        result = []
        for item in counts:
            result.append(str(counts[item]) + ' ' + item)
        return result
