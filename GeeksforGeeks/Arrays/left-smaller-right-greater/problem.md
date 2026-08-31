# GFG. Left Smaller Right Greater
**Platform:** GeeksforGeeks
**Difficulty:** N/A
**Topic:** Arrays

## Problem Statement
Given an unsorted array arr[], find the first element such that every element to its left is less than or equal to it, and every element to its right is greater than or equal to it.

Note: If no such element exists, return -1.

Examples : 

Input: arr = [4, 2, 5, 7]
Output: 5
Explanation: All elements to the left of 5 are less than or equal to 5, and all elements to the right are greater than or equal to 5.
Input: arr = [11, 9, 12]
Output: -1
Explanation: No element in the array satisfies the required condition.

Constraints:
3 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106