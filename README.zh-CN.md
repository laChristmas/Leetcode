# Leetcode

[English](./README.md) | 简体中文

我的 LeetCode 刷题仓库，主要用于练习算法与数据结构。当同一道题的不同思路实现有助于对比时，我会把多份解法都保留下来。

> "Talk is cheap. Show me the code." —— Linus Torvalds

## 目录

- [关于本仓库](#关于本仓库)
- [文件命名规范](#文件命名规范)
- [进度](#进度)
- [本地运行](#本地运行)
- [许可证](#许可证)

## 关于本仓库

- 每道题独立成文件。文件名包含题号、英文标题和解法序号，方便快速定位。
- 同一道题可能存在多个文件（不同思路），便于对照学习。
- 题目顺序遵循 [LeetCode](https://leetcode.com/problemset/) 上的官方编号。

## 文件命名规范

```
{题号}_{英文标题}_{解法序号}.{扩展名}
```

示例：

- `1_twoSum_1.java`：第 1 题（Two Sum），解法 1。
- `49_groupAnagrams_1.java`：第 49 题（Group Anagrams），解法 1。
- `128_longestConsecutiveSequence_1.java`：第 128 题（Longest Consecutive Sequence），解法 1。

约定：

- 题号与 LeetCode 一致。
- 英文标题采用 `lowerCamelCase`（小驼峰）：首词全小写，后续每个单词首字母大写，并去除空格与标点（例如 `twoSum`、`groupAnagrams`、`longestConsecutiveSequence`）。单词标题直接使用全小写（例如假想的 `42_answer_1.java`）。
- 解法序号从 `1` 起递增，用于区分同一题目的不同思路。

## 进度

| # | 题目 | 难度 | 解法 | 备注 |
| :--: | :--- | :--: | :--: | :--- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | 简单 | [✓](./1_twoSum_1.java) | 哈希表，一次遍历 |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | 中等 | [✓](./11_containerWithMostWater_1.java) | 左右双指针，移动较短一侧 |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | 中等 | [✓](./15_3Sum_1.java) | 排序后固定首元 + 双指针，跳过重复三元组 |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | 中等 | [✓](./49_groupAnagrams_1.java) | 以排序后的字符串作为哈希键 |
| 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | 中等 | [✓](./128_longestConsecutiveSequence_1.java) | 哈希集合，只从序列起点向后扩展（`O(n)`） |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | 简单 | [✓₁](./283_moveZeroes_1.java)&nbsp;·&nbsp;[✓₂](./283_moveZeroes_2.java) | 1) 计数 + 左移 + 末尾补 0（两次遍历）；2) 快慢双指针，遇到非零就交换（一次遍历） |
| 2235 | [Add Two Integers](https://leetcode.com/problems/add-two-integers/) | 简单 | [✓](./2235_addTwoIntegers_1.java) | 热身题 |

> 持续更新中。

## 本地运行

```bash
javac 1_twoSum_1.java
java Solution
```

> 文件中只定义了 `Solution` 类。可在 `Solution` 内添加 `main` 方法（或另写一个 runner）来做本地测试。

## 许可证

本仓库采用 [MIT 许可证](./LICENSE) 开源，欢迎浏览与交流。
