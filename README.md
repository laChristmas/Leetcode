# Leetcode

English | [简体中文](./README.zh-CN.md)

My LeetCode practice repository for algorithms and data structures. I keep multiple approaches for the same problem when it helps to compare ideas.

> "Talk is cheap. Show me the code." — Linus Torvalds

## Contents

- [About this repository](#about-this-repository)
- [File naming convention](#file-naming-convention)
- [Progress](#progress)
- [Running locally](#running-locally)
- [License](#license)

## About this repository

- Each problem lives in its own file. The filename includes the problem number, English title, and solution index for quick lookup.
- The same problem may have multiple files (different approaches) for side-by-side study.
- Problem order follows the official numbering on [LeetCode](https://leetcode.com/problemset/).

## File naming convention

```
{problem_number}_{english_title}_{solution_index}.{extension}
```

- **Problem number**: LeetCode problem id, **zero-padded to 5 digits** (e.g. `00001`, `00042`, `02235`) so files sort in numeric order on GitHub.
- **English title**: `lowerCamelCase` — first word lowercase, later words capitalized, no spaces or punctuation (e.g. `twoSum`, `trappingRainWater`).
- **Solution index**: starts at `1` for the first approach; increment for alternate solutions to the same problem.

Examples:

- `00001_twoSum_1.java`: Problem 1 (Two Sum), solution 1.
- `00049_groupAnagrams_1.java`: Problem 49 (Group Anagrams), solution 1.
- `00128_longestConsecutiveSequence_1.java`: Problem 128 (Longest Consecutive Sequence), solution 1.

## Progress

| # | Problem | Difficulty | Solution | Notes |
| :--: | :--- | :--: | :--: | :--- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [✓](./00001_twoSum_1.java) | Hash map, single pass |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | [✓](./00003_longestSubstringWithoutRepeatingCharacters_1.java) | Sliding window with `HashSet` |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | [✓](./00011_containerWithMostWater_1.java) | Two pointers from both ends; advance the shorter side |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | [✓](./00015_3Sum_1.java) | Sort, fix pivot + two pointers; skip duplicate triplets |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | [✓₁](./00042_trappingRainWater_1.java)&nbsp;·&nbsp;[✓₂](./00042_trappingRainWater_2.java)&nbsp;·&nbsp;[✓₃](./00042_trappingRainWater_3.java)&nbsp;·&nbsp;[✓₄](./00042_trappingRainWater_4.java) | 1) Layer-by-layer scan; 2) Monotonic stack; 3) Two pointers; 4) Prefix max arrays |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | [✓](./00049_groupAnagrams_1.java) | Hash map keyed by sorted string |
| 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | [✓](./00128_longestConsecutiveSequence_1.java) | Hash set, expand only from sequence starts (`O(n)`) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | [✓₁](./00283_moveZeroes_1.java)&nbsp;·&nbsp;[✓₂](./00283_moveZeroes_2.java) | 1) Count zeros, shift non-zeros left, zero-fill the tail (two-pass); 2) Fast/slow two-pointer, swap on non-zero (one-pass) |
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Medium | [✓₁](./00438_findAllAnagramsInAString_1.java)&nbsp;·&nbsp;[✓₂](./00438_findAllAnagramsInAString_2.java)&nbsp;·&nbsp;[✓₃](./00438_findAllAnagramsInAString_3.java) | 1) Sliding window + `HashMap`; 2) Fixed window, `int[26]`; 3) Sliding window with match count |
| 560 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | [✓](./00560_subarraySumEqualsK_1.java) | Work in progress |
| 2235 | [Add Two Integers](https://leetcode.com/problems/add-two-integers/) | Easy | [✓](./02235_addTwoIntegers_1.java) | Warm-up |

> Work in progress.

## Running locally

```bash
javac 00001_twoSum_1.java
java Solution
```

> Files only define a `Solution` class. Add a `main` method inside `Solution` (or a separate runner) for local tests.

## License

This repository is open source under the [MIT License](./LICENSE). Feel free to browse and discuss.
