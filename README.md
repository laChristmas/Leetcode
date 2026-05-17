# Leetcode

English | [简体中文](./README.zh-CN.md)

My LeetCode practice repository for algorithms and data structures. I keep solutions in different languages and approaches for the same problem when it helps to compare ideas.

> "Talk is cheap. Show me the code." — Linus Torvalds

## Contents

- [About this repository](#about-this-repository)
- [File naming convention](#file-naming-convention)
- [Progress](#progress)
- [Languages](#languages)
- [Running locally](#running-locally)
- [License](#license)

## About this repository

- Each problem lives in its own file. The filename includes the problem number, English title, and solution index for quick lookup.
- The same problem may have multiple files (different languages or different approaches) for side-by-side study.
- Problem order follows the official numbering on [LeetCode](https://leetcode.com/problemset/).

## File naming convention

```
{problem_number}_{english_title}_{solution_index}.{extension}
```

Examples:

- `1_twoSum_1.py`: Problem 1 (Two Sum), solution 1, Python.
- `49_groupAnagrams_1.java`: Problem 49 (Group Anagrams), solution 1, Java.
- `128_longestConsecutiveSequence_1.java`: Problem 128 (Longest Consecutive Sequence), solution 1, Java.

Conventions:

- Problem numbers match LeetCode.
- English titles use `lowerCamelCase`: the first word is lowercase, every subsequent word is capitalized, and spaces and punctuation are removed (e.g. `twoSum`, `groupAnagrams`, `longestConsecutiveSequence`). Single-word titles are simply lowercase (e.g. an imaginary `42_answer_1.py`).
- Solution indices start at `1` and increase; the same index can be reused across languages for the same idea.

## Progress

| # | Problem | Difficulty | Python | Java | Notes |
| :--: | :--- | :--: | :----: | :--: | :--- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [✓](./1_twoSum_1.py) | [✓](./1_twoSum_1.java) | Hash map, single pass |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | [✓](./11_containerWithMostWater_1.py) | [✓](./11_containerWithMostWater_1.java) | Two pointers from both ends; advance the shorter side |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | [✓](./15_3Sum_1.py) | [✓](./15_3Sum_1.java) | Sort, fix pivot + two pointers; skip duplicate triplets |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | [✓](./49_groupAnagrams_1.py) | [✓](./49_groupAnagrams_1.java) | Hash map keyed by sorted string |
| 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | [✓](./128_longestConsecutiveSequence_1.py) | [✓](./128_longestConsecutiveSequence_1.java) | Hash set, expand only from sequence starts (`O(n)`) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | [✓₁](./283_moveZeroes_1.py)&nbsp;·&nbsp;[✓₂](./283_moveZeroes_2.py) | [✓₁](./283_moveZeroes_1.java)&nbsp;·&nbsp;[✓₂](./283_moveZeroes_2.java) | 1) Count zeros, shift non-zeros left, zero-fill the tail (two-pass); 2) Fast/slow two-pointer, swap on non-zero (one-pass) |
| 2235 | [Add Two Integers](https://leetcode.com/problems/add-two-integers/) | Easy | [✓](./2235_addTwoIntegers_1.py) | [✓](./2235_addTwoIntegers_1.java) | Warm-up |

> Work in progress.

## Languages

Currently used:

- Python 3
- Java

## Running locally

### Python

```bash
python 1_twoSum_1.py
```

> Files only define a `Solution` class. To run directly, add a small test at the bottom, for example:
>
> ```python
> if __name__ == "__main__":
>     print(Solution().twoSum([2, 7, 11, 15], 9))
> ```

### Java

```bash
javac 1_twoSum_1.java
java Solution
```

> Similarly, add a `main` method inside `Solution` (or a separate runner) for local tests.

## License

This repository is open source under the [MIT License](./LICENSE). Feel free to browse and discuss.
