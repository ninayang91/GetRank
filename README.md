# GetRank
Get rank of a given number(not including itself) in a stream

Imagine you are reading in a stream of integers. Periodically, you wish to be able to look up the rank of a number x (the number of values less than or equal tox). Implement the data structures and algorithms to support these operations.That is,implement the method track(int x), which iscalled when each number is generated, and the method getRankOfNumber(int x), which returns the number of values less than or equal to x (not including x itself).

Stream (inorder ofappearance): 5, 1, 4, 4, 5, 9, 7, 13, 3

getRankOfNumber(l) = 0 

getRankOfNumber(3) = 1 

getRankOfNumber(4) = 3

BST, insert(d), 

getRank(int d){

   if d==data, return left_size
   
   if d<data, return left.getRank(d)
   
   if(d>data), return left_size+1+right.getRank(d)
}
