#顺序刷题计划

##Schedule
从第一题开始按数字顺序向下刷，以**增加灵活运用数据结构和算法的熟练度**。预计每周完成10-20题。

##Code review
每天进行，目的是
  * 让代码尽量贴近工业界标准
  * 尽可能提高性能
    
##Summary
  + ###提纲
    + 题目理解，特殊情况考虑，抽象直观  
    + 数据结构衡量
    + 算法选用衡量
    + 复杂度和有效性分析
  + ###N001 Two Sum 
    + Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
     + 题目给出了很多限制，所以不用考虑多次出现等情况，算法变得直接简单。
     + 用hashmap保存数据，并在后面的搜索中调用，关键是舍得浪费内存。
     + 算法直观，一个优化：边跑边存只用跑一遍。
     + 由题目限制，复杂度n。
  + ###N002  Add Two Numbers
    + You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    + 特殊情况，
          a、考虑首位数进位，使得所得的链表比给定的两个链表要长；
          b、考虑给定的两个链表位数不同。
    + 数据结构直观。
    + 算法直观，但递归更优。
    + 有效性显然，复杂度n。
  + ###N003   Longest Substring Without Repeating Characters
    + Given a string, find the length of the longest substring without repeating characters.
       + **Example 1**: Input: "abcabcbb", Output: 3, Explanation: The answer is "abc", with the length of 3. 
       + **Example 2**: Input: "bbbbb", Output: 1, Explanation: The answer is "b", with the length of 1.
       + **Example 3**: Input: "pwwkew", Output: 3, Explanation: The answer is "wke", with the length of 3. 
       Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
    + **解法一**：使用Hashmap保存char和出现位置，两个int存当前不重复的字符串起始点和结束点。
    + **解法二**：因为计算对象是字符串，可以用Boolean-array替代Hashmap的功能，使其大大加速。
  + ###N004   Median of Two Sorted Arrays
    + There are two sorted arrays nums1 and nums2 of size m and n respectively.
      Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
      You may assume nums1 and nums2 cannot be both empty.
      + **Example 1**:
      nums1 = [1, 3],
      nums2 = [2],
      The median is 2.0
      + **Example 2**:
      nums1 = [1, 2],
      nums2 = [3, 4],
      The median is (2 + 3)/2 = 2.5
    +
    
  + ###N005 E  Longest Palindromic Substring
    + Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
    + **Solution1** dp(n^2):  If we already knew that X is a palindrome, it is obvious that ch1+X+ch2 must be a palindrome iff ch1==ch2, thus we can use dp.
    + **Solution2** Expand Around Center(n^2): We observe that a palindrome mirrors around its center. 
    Therefore, a palindrome can be expanded from its center, and there are only 2n-1 such centers. 
    Check each center to find the longest palindromic substring.
    + **Solution3** Manacher's Algorithm(n): see https://www.geeksforgeeks.org/manachers-algorithm-linear-time-longest-palindromic-substring-part-4/
    
  + ###N008 M String to Integer (atoi)
    + Implement atoi which converts a string to an integer.
    + The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
     The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
     If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
     If no valid conversion could be performed, a zero value is returned.
    + Note:
       +Only the space character ' ' is considered as whitespace character.
       +Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
    +Solution: Always thinking the corner cases.
    
  + ###N222 M Count Complete Tree Nodes
    + Given a complete binary tree, count the number of nodes.
    
    + Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Complete Tree Nodes.
      Memory Usage: 45.4 MB, less than 9.76% of Java online submissions for Count Complete Tree Nodes.
    +**bit shift**
    https://www.interviewcake.com/concept/java/bit-shift
    Left Shifts <<:
    A single left shift multiplies a binary number by 2
    logical right shift >>>: 
    For positive numbers, a single logical right shift divides a number by 2, throwing out any remainders.
    Arithmetic Right Shifts >>
    
  + ###N013 E Roman to Integer
    + Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
    
    + 使用switch，写在同一个函数中以节省内存。
    
  + ###N038 E Count and Say
    + The count-and-say sequence is the sequence of integers with the first five terms as following:
      1.     1
      2.     11
      3.     21
      4.     1211
      5.     111221
      1 is read off as "one 1" or 11.
      11 is read off as "two 1s" or 21.
      21 is read off as "one 2, then one 1" or 1211.
      Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. 
      You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.
      
    + 普通递归即可。
    
  + ###N053 E   Maximum Subarray
    +Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    
    + 双指针有O(p)解
    
  + ###N136 E Single Number
    + Given a non-empty array of integers, every element appears twice except for one. Find that single one.
    
    +Bitwise operators: https://www.geeksforgeeks.org/bitwise-operators-in-java/
  
  + ###N169 E  Majority Element
    + Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
      You may assume that the array is non-empty and the majority element always exist in the array.
      
    + Boyer-Moore Voting Algorithm
    
  + ###N171 E Excel Sheet Column Number
    + Given a column title as appear in an Excel sheet, return its corresponding column number.
    
    + like converting a binary number to a decimal, in this problem, we need to convert a base-26 to decimal.
    
  + ###190  E Reverse Bits
    + Reverse bits of a given 32 bits unsigned integer.
    
    + Familiarity with bitwise operation!
    
  + ###191 E Number of 1 Bits
    + Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).
    
    + Using the bitwise AND operator, we can find the last '1' occurring in a unsigned integer.
    
  + ###198 E    House Robber
    + You are a professional robber planning to rob houses along a street.
     Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
      
      Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
    
    + Sometimes, it'd be better to check and optimize a DP algorithm by cutting variable's uses for saving the memory costs after finishing the algorithm.
    
  + ###237 E    Delete Node in a Linked List
    + Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
    
    + Too tricky, so it's better remember the solution: copy node.next.val to node.val, and delete the last node.
  
  + ###326 E    Power of Three
    + Given an integer, write a function to determine if it is a power of three.
    
    + Don't forget basic math knowledge!
  
  + ###371 E   Sum of Two Integers
    + Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
    
    + Bitwise manipulation. See: [A summary]( https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently "how to use bit manipulation to solve problems easily and efficiently")
    
   
  