# Week 7 Notes

## Conversions

- base expansion: calculations in target base
- division: calculations in starting base
- subtraction: calculations in starting base
- bin to/from hex: no math involved

division example: 1590 to base-16

```
1590 / 16 = 99 r6
  99 / 16 =  6 r3
   6 / 16 =  0 r6

1590 (base-10) = 636 (base-16)
```

division example: 1002 to base-16

```
1002 / 16 = 62 r10
  62 / 16 =  3 r14
   3 / 16 =  0 r 3

3 14 10 --> 3EA (base-16)

1002 (base-10) = 3EA (base-16)
```

### Subtraction (base-10 to base-2)

1. Find the highest power of 2 that's less than or equal to your number.
2. Subtract that power of 2 from your number.
3. Write a 1 in the column for the power of 2 from step 1.
4. Repeat steps 1 to 3 until you reach 0.
5. Fill the other columns with zeroes.

Example: 1590 to base-2

Powers of 2: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048

1590 - 1024 (2^10) = 566
 566 -  512 (2^9)  =  54
  54 -   32 (2^5)  =  22
  22 -   16 (2^4)  =   6
   6 -    4 (2^2)  =   2
   2 -    2 (2^1)  =   0

1590 (base-10) = 11000110110 (base-2)

### Bin to/from Hex

Every hex digit corresponds to exactly four binary digits. You can pad a binary number
with leading zeroes if it doesn't have a multiple of four digits.

Example: 11000110110 (base-2) to base-16

Step 1: Pad with leading zeroes so we have twelve digits and make groups of four:

0110 0011 0110

Step 2: Convert each group of four to a hex digit however you find it easiest to do so

```
6    3    6 --> 636 (base-16)
```

Example: 3FCD381007 to binary

Step 1: Convert hex each digit into a four-digit binary number (pad with leading zeroes if fewer than four digits).

```
3    F    C    D    3    8    1    0    0    7
3    15   12   13   3    8    1    0    0    7
0011 1111 1100 1101 0011 1000 0001 0000 0000 0111
```

Step 2: Combine these numbers into your binary number and drop the leading zeroes from the result

0011111111001101001110000001000000000111

11111111001101001110000001000000000111

## Fixed-Size Numbers

- computers work with fixed-sized chunks of memory
- two numbers of the same type (like int) always use the same
  amount of memory, no matter how large the number
- limitations:
    - with limited size we can only represent a small range of numbers
    - problems happen when we try to exceed this range

Example: let's do math in decimal with exactly 8 digits in every number:

Problem: What is 0000 1590 + 0003 0400?

```
  0000 1590
+ 0003 0400
===========
  0003 1990
```

- 0000 1590 = 1,590
- 0003 0400 = 30,400
- 0003 1990 = 31,990

Problem: What is 4897 3432 + 6156 3765?

```
 1111  1
  4897 3432
+ 6156 3765
===========
  1053 7197
```

- 4897 3432 = 48,973,432
- 6156 3765 = 61,563,765
- 1053 7197 = 10,537,197

Example: In binary with 8-bit numbers, what is 0110 1010 + 1101 0111?

```
 11111 11
  0110 1010 = 108
+ 1101 0111 = 215
===========
  0100 0001 =  65
```

## Two's Complement

Nine's complement: two base-10 numbers that, when added, give a 9 in every digit.

Example (8-digit fixed size): what is the nine's complement of 4897 3432?

```
  4897 3432
+ 5102 6567
===========
  9999 9999
```

5102 6567 is the nine's complement of 4897 3432.

Ten's complement: two base-10 numbers that, when added, give a zero (10, kinda) in every digit.

Easy way to find this: add 1 to the nine's complement!

```
 11111 111
  4897 3432
+ 5102 6568
===========
  0000 0000
```

Why ten and nine? Because we're talking about base-10. In any other base N, we care about N and N-1.

One's complement: two base-2 numbers that, when added, give a 1 in every digit.

Example (8-digit fixed size): what is the one's complement of 0110 1010 (108)?

```
  0110 1010
+ 1001 0101
===========
  1111 1111
  ```

Two's complement: two base-2 numbers that, when added, give a zero (two, kinda) in every digit.

Easy way to find this: add 1 to the one's complement!

```
 11111 11
  0110 1010
+ 1001 0110
===========
  0000 0000
```

