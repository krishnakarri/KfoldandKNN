KfoldandKNN
===========

Machine learning algorithm

Input
The input consists of two files. The first file contains cross-validation information, and the second
file contains the data.
The first file
Here is an example of the first file:
2 9 3
0 1 2 3 4 5 6 7 8
8 1 2 3 4 5 6 7 0
4 0 8 2 6 3 7 1 5
The numbers in each row are separated by a single space. The first number is the k of k-fold, to be
used in the k-fold cross validation scheme. The second number is m, the number of examples. The
third number is t, the number of random permutations (shuffles). The information in the above
the file is: 2-fold cross-validation on 9 examples, with 3 random permutations. The rest of the lines
are the t “random” permutations.
The second file
Here is an example of the second file:
4 5
. + . . −
. + . − −
. + . . −
. + . . −
The numbers and characters in each row are separated by a single space. The first line has two
numbers: rows cols. This is followed by a grid of size rows by cols. Each entry in the grid is one
of {+, −, .}, where “+” indicates a positive example, “−” indicates a negative example, and “.”
indicates the location is not an example. Thus, the above file specifies the following 9 examples:
example number x1 x2 y
0 1 0 +
1 4 0 −
2 1 1 +
3 3 1 −
4 4 1 −
5 1 2 +
6 4 2 −
7 1 3 +
8 4 3 −

Observe that the examples are numbered in “raster” ordering: top-down left-right. The value of x1
is the horizontal coordinate, and the value of x2 is the vertical coordinate, measured downwards.


output:

For the example above, for k = 1 the output format should be (the numbers are most likely wrong):
k=1 e=0.1 sigma=0.01
+ + + − −
+ + − − −
+ + + − −
+ + + − −
