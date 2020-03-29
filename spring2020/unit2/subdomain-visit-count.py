class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        counter = {}
        for item in cpdomains:
            split = item.split(" ")
            num_visits = int(split[0])
            full_domain = split[1]
            domains_split = full_domain.split(".")

            building = ""
            i = len(domains_split) - 1
            while i >= 0:
                building = domains_split[i] + building
                if building in counter:
                    counter[building] = counter[building] + num_visits
                else:
                    counter[building] = num_visits
                if i != 0:
                    building = "." + building
                i -= 1
        res = []
        for key in counter:
            res.append(str(counter[key]) + " " + key)
        return res
