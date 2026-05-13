#! /usr/bin/env python3

from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramDict: dict(str,List[str]) = {} # type: ignore
        for s in strs:
            sortedArray = ''.join(sorted(s))
            if sortedArray in anagramDict:
                anagramDict.get(sortedArray).append(s)
            else:
                anagramDict[sortedArray] = [s]
        return list(anagramDict.values());