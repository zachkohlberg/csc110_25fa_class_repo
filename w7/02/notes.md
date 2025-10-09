# Week 7 Notes

## Conversions

### Division

Example: 1002 from base-10 to base-16

```
1002 / 16 = 62 r10
  62 / 16 =  3 r14
   3 / 16 =  0 r 3

3 14 10 --> 3EA

1,002 (base-10) = 3EA (base-16)
```

### Subtraction (Base-10 to Base-2)

1. Find the largest power of 2 less than or equal to your number.
2. Subtract that power of 2 from your number.
3. Write a 1 in the column for that power of 2.
4. Repeat 1-3 until you're left with 0.
5. Write a 0 in every other column.

Example: 1590 from base-10 to base-2

Powers of 2: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048

```
1590 - 1024 (2^10) = 566
 566 -  512 (2^9)  =  54
  54 -   32 (2^5)  =  22
  22 -   16 (2^4)  =   6
   6 -    4 (2^2)  =   2
   2 -    2 (2^1)  =   0
```

11000110110 (base-2) = 1590 (base-10)

### Bin To/From Hex

Important fact: each hex digit maps onto exactly four binary digits.

- Group bits into chunks of four
- If number of bits isn't a multiple of four, we can pad with zeroes on the **left** side

Example: convert 11000110110 from base-2 to base-16

```
0110 0011 0110
6    3    6

11000110110 (base-2) = 636 (base-16)
```

Example: convert AF3BC327801F from base-16 to base-2

```
A    F    3    B    C    3    2    7    8    0    1    F
10   15   3    11   12   3    2    7    8    0    1    15
1010 1111 0011 1011 1100 0011 0010 0111 1000 0000 0001 1111
```

## Fixed-Size Integers

What if numbers had to contain the exact same number of digits, no matter how large or small?

Computers operate on fixed-sized chunks of memory, so it's efficient to represent numbers
using a certain amount of memory. Two different numbers of the same type normally take up
the same number of digits, even if completely different.

Example: base-10 numbers with a fixed size of 8 digits

- Can't exceed 8 digits to represent number
- Must use all 8 digits, so we can pad with leading zeroes as needed
- I'll space digits into chunks of 4 for readability

```
  0000 1590 = 1,590
+ 0003 0400 = 30,400
===========
  0003 1990 = 31,990

 11111 111
  4765 9725 = 47,659,725
+ 6754 3275 = 67,745,275
===========
  1520 3000 = 15,203,000
```

Limitation: can't represent numbers greater than 99,999,999

Example: base-2 numbers with a fixed size of 8 bits

```
 11111 11
  1101 0110 = 128 + 64 + 16 + 4 + 2 = 128 + 86 = 214
+ 0110 1110 = 96 + 14 = 110
===========
  0100 0100 = 68
```

When working with a fixed size, we can only represent a limited range of numbers.

## Two's Complement

Nine's complement: two fixed-size base-10 numbers that, when added, give a result with nine in every digit

```
  4765 9725 = 47,659,725
+ 5234 0274 = 52,340,274
===========
  9999 9999 = 99,999,999
```

Ten's complement: two fixed-size base-10 numbers that, when added, give a zero (ten, kinda) in every digit

Easy way to get ten's complement: add 1 to the nine's complement!

```
 11111 111
  4765 9725 = 47,659,725
+ 5234 0275 = 52,340,274
===========
  0000 0000 = 0
```

Why nine and ten? Because base-10. In a base N, we care about N and N-1 complements.

One's complement: two fixed-size base-2 numbers that, when added, give a one in every digit

```
  1101 0110 = 214
+ 0010 1001 =  41
===========
  1111 1111 = 255
```

Two's complement: two fixed-size base-2 numbers that, when added, give a zero (two, kinda) in every digit

Easy way to get the two's complement: add 1 to the one's complement!

```
 11111 11
  1101 0110 = 214
+ 0010 1010 =  42
===========
  0000 0000 =   0
```

Let's look at negative 8-digit fixed size base 10 numbers.

```
a = fixed-size decimal integer
a_comp = the ten's complement of a

a + a_comp = 0

b = a different fixed-size decimal integer

I claim: b + a_comp = b - a

a + a_comp = 0
b + a + a_comp = b
b + a + a_comp - a = b - a
b + a_comp = b - a

0000 0005 = 5
9999 9995 = -5
0000 0012 = 12

 11111 11
  0000 0012
+ 9999 9995
===========
  0000 0007 = 7
```

## Integers

- signed = can be positive, zero, or negative
- unsigned = can't be negative
- overflow = when integers exceed the range their fixed size can represent,
  they overflow to the other end of that range

```
8-digit decimal fixed size signed integers

0000 0000 = zero
0000 0000 = ten's complement of zero

5000 0000 = fifty million
5000 0000 = ten's complement of fifty million

0000 0000 to 4999 9999 = zero and positive numbers (0 to 49,999,999)
5000 0000 to 9999 9999 = negative numbers (-50 million to -1)

8-digit binary fixed size signed integers

0000 0000 = zero and its two's complement
1000 0000 = 128 and its two's complement

0000 0000 to 0111 1111 = zero and positive numbers (0 to 127)
1000 0000 to 1111 1111 = negative numbers (-128 to -1)
```

- bit = single 1 or 0
- byte = 8 bits
- Java integer types:
  - byte: 8-bit or 1-byte signed integer
  - short: 16-bit or 2-byte signed integer
  - int: 32-bit or 4-byte signed integer
  - long: 64-bit or 8-byte signed integer
  - char: 16-bit or 2-byte unsigned integer

## Floating-Point Numbers

Imagine we had 8 decimal digits to represent a real number

XXXX YYYY: first four digits are the whole number part, second
four digits are the fractional part (fixed point)

1128 9940 = 1128.994

XX YYYYYY: first two digits are an exponent, other six are the
significant digits (floating point)

11 289940 = 0.28994 x 10^11 = 28,994,000,000

Java's floating-point types:

- float = 32-bit/4-byte single-precision floating point number
- double = 64-bit/8-byte double-precision floating point number







