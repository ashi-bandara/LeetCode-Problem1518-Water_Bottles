
# LeetCode Challenge D3
## Achievements
[![image.png](https://i.postimg.cc/HxnHnv1J/image.png)](https://postimg.cc/xkwBFRCY)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics. 


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by  [[1518.  Water Bottles](https://leetcode.com/problems/water-bottles/)]. Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
There are  `numBottles`  water bottles that are initially full of water. You can exchange  `numExchange`  empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers  `numBottles`  and  `numExchange`, return  _the  **maximum**  number of water bottles you can drink_.


**Example**

![](https://assets.leetcode.com/uploads/2020/07/01/sample_1_1875.png)

> **Input:** numBottles = 9, numExchange = 3
> 
> **Output:** 13
> 
> **Explanation:** You can exchange 3 empty bottles to get 1 full water bottle. Number of water bottles you can drink: 9 + 3 + 1 = 13. 

**Language Used**

> Java

**Difficulty**

> Easy



## Solution Overview

I introduced 2 new variables, number of bottles exchanged, i.e. the number of empty bottles I can exchange, and a variable to maintain the count of total full bottles encountered during the process.

```cpp
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int exchBottles = numBottles;
        int fullBottles = numBottles;

        while(exchBottles>=numExchange){ 
        //the number of empty bottles must be greater than the number of bottles required to perform an  exchange 
            numBottles = exchBottles/numExchange; 
            // Here I calculated the number of full bottles I could gain after exchange
            
            exchBottles = exchBottles % numExchange + numBottles; 
            // Here the remaining amount of empty bottles after the exchange is calculated
            
            fullBottles = fullBottles + numBottles; 
            //This counter adds the already existing number of full bottles to the ones I exchanged just now
        }
        return fullBottles;
    }
}
```




