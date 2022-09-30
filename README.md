Example: The AABBB Language
---

# Problem Statement

In language `AABBB`, all words consist of `aa`s or `bbb`s or some combination of these two patterns.

Implement two methods:

1. One that will compute the number of words of length `n` in this language. By default, there are no words of 0-length and this language has no words of length 1. You may assume that `n >= 0`.
2. One that will return all valid words of a given length `n`. You may assume `n >= 0` but you should throw a `TooManyWordsException` for `n > 30`. Consider using `StringBuilder`s.

# Examples

- `n` = 0
    - Returns: 0 for number of words
    - By definition.
- `n` = 1
    - Returns: 0 for number of words
- `n` = 2
    - Returns: 1 for number of words
    - The only possible word is `aa`.
- `n` = 3
    - Returns: 1 for number of words
    - The only possible word is `bbb`.
- `n` = 4
    - Returns: 1 for number of words
    - The only possible word is `aaaa`.
- `n` = 5
    - Returns: 2 for number of words
    - The possible words are `aabbb` and `bbbaa`.
- `n` = 12
    - Returns 12 for number of words
- `n` = 45
    - Returns 128801 for number of words

The skeleton source code for this question is in the package `aabbbstrings`. You have to implement the methods `countStrings` and `getWords` in the class `AABBBString`.

**Think about recursive and non-recursive approaches to this problem. Which approach is easier to implement?**