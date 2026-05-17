#! /usr/bin/env python3

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        ans = list()
        for cur, num in enumerate(nums[:-2]):
            if (cur != 0 and num == nums[cur-1]):
                continue
            elif (num+nums[cur+1]+nums[cur+2] > 0):
                break
            elif (num+nums[len(nums)-1]+nums[len(nums)-2] < 0):
                continue
            
            i = cur + 1
            j = len(nums) - 1
            while(i < j):
                if (i != cur+1 and nums[i] == nums[i-1]):
                    i+=1
                    continue
                
                if (num+nums[i]+nums[j] < 0):
                    i+=1
                elif (num+nums[i]+nums[j] > 0):
                    j-=1
                else:
                    ans.append([num, nums[i], nums[j]])
                    i+=1
                    j-=1
                    
        return ans