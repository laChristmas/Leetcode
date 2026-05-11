# Leetcode

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

- `1_twosum_1.py`: Problem 1 (Two Sum), solution 1, Python.
- `1_twosum_2.java`: Problem 1 (Two Sum), solution 2, Java.

Conventions:

- Problem numbers match LeetCode.
- English titles are lowercase, with spaces and punctuation removed.
- Solution indices start at `1` and increase; the same index can be reused across languages for the same idea.

## Progress

| # | Problem | Difficulty | Python | Java | Notes |
| :--: | :--- | :--: | :----: | :--: | :--- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [✓](./1_twosum_1.py) | [✓](./1_twosum_1.java) | Hash map, single pass |

> Work in progress.

## Languages

Currently used:

- Python 3
- Java

## Running locally

### Python

```bash
python 1_twosum_1.py
```

> Files only define a `Solution` class. To run directly, add a small test at the bottom, for example:
>
> ```python
> if __name__ == "__main__":
>     print(Solution().twoSum([2, 7, 11, 15], 9))
> ```

### Java

```bash
javac 1_twosum_1.java
java Solution
```

> Similarly, add a `main` method inside `Solution` (or a separate runner) for local tests.

## License

This repository is open source under the [MIT License](./LICENSE). Feel free to browse and discuss.
