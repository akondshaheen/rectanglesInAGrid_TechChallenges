Given a grid of size m x n, calculate the total number of rectangles contained in this rectangle. All integer sizes and positions are counted.

Examples:

numberOfRectangles(3, 2) == 18
numberOfRectangles(4, 4) == 100
Here is how the 3x2 grid works (Thanks to GiacomoSorbi for the idea):

Ans:
Let us derive a formula for number of rectangles.
If the grid is 1×1, there is 1 rectangle.
If the grid is 2×1, there will be 2 + 1 = 3 rectangles
If it grid is 3×1, there will be 3 + 2 + 1 = 6 rectangles.
we can say that for N*1 there will be N + (N-1) + (n-2) … + 1 = (N)(N+1)/2 rectangles
If we add one more column to N×1, firstly we will have as many rectangles in the 2nd column as the first,
and then we have that same number of 2×M rectangles.
So N×2 = 3 (N)(N+1)/2
After deducing this we can say
For N*M we’ll have (M)(M+1)/2 (N)(N+1)/2 = M(M+1)(N)(N+1)/4
So the formula for total rectangles will be M(M+1)(N)(N+1)/4 
