#! /usr/bin/env python3

from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        count = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                count += 1
            else:
                nums[i - count] = nums[i]
        for i in range(len(nums) - count, len(nums)):
            nums[i] = 0
        