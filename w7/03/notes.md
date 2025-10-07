# Week 7 Notes

## Conversions

### Division

Example: convert 1002 from base-10 to base-16

```
1002 / 16 = 62 r10
  62 / 16 =  3 r14
   3 / 16 =  0 r 3

3 14 10 --> 3EA

1002 (base-10) = 3EA (base-16)
```

### Subtraction (Base-10 to Base-2)

1. Find the highest power of 2 less than or equal to your number
2. Subtract that power of 2 from your number
3. Write a 1 in the column for that power of 2
4. Repeat 1-3 until you reach zero
5. Write a 0 in the empty columns

Example: convert 1590 from base-10 to base-2

Powers of 2: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048

```
1590 - 1024 (2^10) = 566
 566 -  512 (2^9)  =  54
  54 -   32 (2^5)  =  22
  22 -   16 (2^4)  =   6
   6 -    4 (2^2)  =   2
   2 =    2 (2^1)  =   0

11000110110 (base-2) = 1590 (base-10)
```

### Binary to/from Hex

Important fact: each hex digit corresponds to **exactly** four binary digits.

- we can pad with leading zeroes (on the **left** side) without changing the meaning of a number
- we can add spacing to group binary into chunks of four bits

Example: convert 11000110110 from base-2 to base-16

```
011000110110
0110 0011 0110
6    3    6

11000110110 (base-2) = 636 (base-16)
```

Example: convert 5BE863F6A01D from base-16 to base-2

```
5    B    E    8    6    3    F    6    A    0    1    D
5    11   14   8    6    3    15   6    10   0    1    13
0101 1011 1110 1000 0110 0011 1111 0110 1010 0000 0001 1101
10110111110100001100011111101101010000000011101 (base-2) = 5BE863F6A01D (base-16)
```

## Fixed-Size Integers

What if we had numbers that always contained the exact same number of digits, no matter how big
or small the actual number was?

- We can pad smaller numbers with leading zeroes
- We can't represent numbers with too many digits

Example: 8-digit fixed-size numbers in base-10

```
  0000 1590 = 1,590
+ 0003 0400 = 30,400
===========
  0003 1990 = 31,990

 11111 11
  3765 3052 = 37,653,052
+ 6834 7995 = 68,347,995
===========
  0600 1047 =  6,001,047
```

Limitation: if we go past 99,999,999, we overflow

Example: 8-bit fixed-size binary numbers

```
 1       1
  1010 0001 = 161
+ 1101 1101 = 221 = 128 + 93 = 128 + 64 + 16 + 13
===========
  0111 1110 = 126 = 64 + 32 + 16 + 14
```

## Two's Complement

Nine's complement: two fixed-size base-10 numbers that, when added, result in a number with 9 in every digit

```
  3765 3052 = 37,653,052
+ 6234 6947 = 62,346,947
===========
  9999 9999 = 99,999,999
```

Ten's complement: two fixed-size base-10 numbers that, when added, result in all zeroes (tens, kinda)

Shortcut: take the nine's complement and add 1

```
 11111 111
  3765 3052 = 37,653,052
+ 6234 6948 = 62,346,948
===========
  0000 0000 = 0
```

Why nine and ten? Because base-10! In base N, we care about N and N-1 complements.

One's complement: two fixed-size base-2 numbers that, when added, result in all ones

```
  1010 0001 = 161
+ 0101 1110 =  94
===========
  1111 1111 = 255
```

Two's complement: two fixed-size base-2 numbers that, when added, result in all zeroes (twos, kinda)

Shortcut: add one to the one's complement

```
 11111 111
  1010 0001 = 161
+ 0101 1111 =  95
===========
  0000 0000 =   0
```

Back to base-10 8-digit numbers...

```
 65,784
-63,584
=======
  2,200

How do I do this?
   0006 5784
+ -0006 3584
===========

Ten's complement of 0006 3584
0006 3584 original
9993 6415 nine's complement
9993 6416 +1 gives ten's complement

 11111 111
  0006 5784
+ 9993 6416
==========
  0000 2200
```



