#!/usr/bin/env python3

from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        current, left, right = 0, 0, len(height) - 1
        max_area = min(height[left], height[right]) * (right - left)
        while (left < right):
            if height[left] <= current:
                left += 1
            elif height[right] <= current:
                right -= 1
            current = min(height[left], height[right])
            max_area = max(max_area, current * (right - left))
        return max_area