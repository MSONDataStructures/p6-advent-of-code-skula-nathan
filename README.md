# Advent of Code 2024 Problem 7

This mini-project is a challenging problem from the 2024 Advent of Code
event, for Day 7, found at https://adventofcode.com/2024/day/7

The project is to be completed two ways, once using recursion, and once
without using recursion. If you have a method that calls itself, you are
using recursion.

You may find it helpful to use the `In` class from Coursera, in particular
the `hasNextLine` and `readNextLine` methods. The Coursera library is
included in this project. I also used the `Long.parseLong` and the
`String.split` methods from the Java library. Feel free to use a different
approach, and modify whatever you like.

After your code is working for the small example in the documentation below
(and in the `day07ex.txt` file), switch over to the larger input file and see
if you can solve the challenge. The numbers get **big**, which is why these
methods return a `long` instead of an `int`.

On Advent of Code, after you finish part 1, there is a part 2 which uses
the same input file. You do not need to complete part 2 for this assignment.

## Backstory
Well, these things have a lot of backstory, and you don't really need all
that to complete the problem. Here is the description from the website.

## Day 7: Bridge Repair

The Historians take you to a familiar rope bridge over a river in the middle
of a jungle. The Chief isn't on this side of the bridge, though; maybe he's
on the other side?

When you go to cross the bridge, you notice a group of engineers trying to
repair it. (Apparently, it breaks pretty frequently.) You won't be able to
cross until it's fixed.

You ask how long it'll take; the engineers tell you that it only needs final
calibrations, but some young elephants were playing nearby and stole all the
operators from their calibration equations! They could finish the calibrations
if only someone could determine which test values could possibly be produced
by placing any combination of operators into their calibration equations
(your puzzle input).

## For example

`190: 10 19`<br>
`3267: 81 40 27`<br>
`83: 17 5`<br>
`156: 15 6`<br>
`7290: 6 8 6 15`<br>
`161011: 16 10 13`<br>
`192: 17 8 14`<br>
`21037: 9 7 18 13`<br>
`292: 11 6 16 20`<br>

Each line represents a single equation. The test value appears before the
colon on each line; it is your job to determine whether the remaining numbers
can be combined with operators to produce the test value.

Operators are always evaluated left-to-right, **not** according to precedence rules.
Furthermore, numbers in the equations cannot be rearranged. Glancing into the
jungle, you can see elephants holding two different types of operators:
add (+) and multiply (*).

Only three of the above equations can be made true by inserting operators:

`190: 10 19` has only one position that accepts an operator: between 10 and 19.
Choosing + would give 29, but choosing * would give the test value
(10 * 19 = 190).<br>
`3267: 81 40 27` has two positions for operators. Of the four possible
configurations of the operators, two cause the right side to match the
test value: 81 + 40 * 27 and 81 * 40 + 27 both equal 3267 (when evaluated
left-to-right)!<br>
`292: 11 6 16 20` can be solved in exactly one way: 11 + 6 * 16 + 20.

The engineers just need the total calibration result, which is the sum of
the test values from just the equations that could possibly be true. In the
above example, the sum of the test values for the three equations listed
above is **3749**.

Determine which equations could possibly be true. What is their total
calibration result?
