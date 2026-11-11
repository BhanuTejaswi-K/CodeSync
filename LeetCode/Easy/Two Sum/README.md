# Two Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)

---

## Topics

- Array
- Hash Table

---

## Problem Link

https://leetcode.com/problems/two-sum

---

## Problem Statement

You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 
OriginalJavaExample 1:

Input: int[] nums = new int[]{2, 7, 11, 15};int target = 9;

Output: [0,1]

Explanation:

The sum of nums[0] and nums[1] is 2 + 7 = 9, which equals the target. Therefore, the indices [0, 1] are returned.

Example 2:

Input: int[] nums = new int[]{3, 2, 4};int target = 6;

Output: [1,2]

Explanation:

The sum of nums[1] and nums[2] is 2 + 4 = 6, which equals the target. Therefore, the indices [1, 2] are returned.

Example 3:

Input: int[] nums = new int[]{3, 3};int target = 6;

Output: [0,1]

Explanation:

The sum of nums[0] and nums[1] is 3 + 3 = 6, which equals the target. Therefore, the indices [0, 1] are returned.

 
Constraints:

	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists.

 
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

---

## Language

java

---

Powered by SyncLeetX ⚡
