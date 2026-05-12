Alibayev Danial

IT-2504

Analysis questions:

1) How does graph size affect BFS and DFS performance?

As the graph size increases the execution time for both BFS and DFS increases proportionally. 

2) Which traversal is faster in your experiments?

In these experiments, DFS often executes slightly faster.

3) Do results match the expected complexity O(V+E)?

Yes, the results align with the O(V+E) time complexity. When the graph size increased from 10 to 30 to 100 nodes, the exectuion time grew at a steady rate.

4) How does graph structure affect traversal order?

In a dense graph (many edges per vertex), BFS have a very wide traversal order. In a sparse graph (few edges) BFS and DFS output a similar traversal order.

5) When if BFS preferred over DFS?

BFS is the preferred to find the shortes path between two nodes in an unweighted graph. Because it explores layer by layer. The first time it discovers a target node, it is guaranteed to have found the shortes route. It is ideal for GPS navigation systems and peer to peer networking.

6) What are the limitations of DFS?

DFS does not guarantee the shortest path. It will find a path to a  target, but it might be a highly inefficient route.

DFS stores its state on the system's call stack. If a graph is extremely deep, a recursive DFS will crash the program with a stock overflow.

A. Project Overview

This project implements a Directed Graph data structure in Java

Vertex: represents an individual node with unique ID.

Edge: Represents a one-way connection between two nodes.

Traversals: Includes Breadth-First Search (layer-by-layer) and Depth-First Search (deep-exploration).

B. Class Descriptions

Vertex: A simple container for the node's identifier.

Edge: Stores references to the source and destination IDs.

Graph: Uses a HashMap of ArrayLists to implement an Adjacency List.

Experiment: Testing class to manage experiments.

Main: Class made to start the project.

C. Algorithm Descriptions

Breadth-First Search(BFS) 

Uses a Queue(FIFO). It visits all neighbors of the current node before moving to the next level. The complexity is O(V+E) where V is vertices and E is edges. Use case: Finding the shortest path in an unwighted graph.

Depth-First Search(DFS)

Uses recursion. It follows a path as far as possible before backtracking. The complexity is O(V+E). Use case: Topological sorting.

D.Experimental Results

<img width="1303" height="550" alt="image1" src="https://github.com/user-attachments/assets/f59942e4-5ca4-4940-8f43-57f3d6c6ac2a" />

As the results shows, DFS faster with small (10,30) amount of nodes, while at 100 nodes the results are slightly different.

E. Screenshots

<img width="1303" height="550" alt="image1" src="https://github.com/user-attachments/assets/5b347ae2-8750-4bd5-87c1-a4a6c46b3812" />

<img width="1354" height="521" alt="image2" src="https://github.com/user-attachments/assets/d3b140fc-17f4-4e5b-a37b-5ef402331a28" />

<img width="1389" height="566" alt="image3" src="https://github.com/user-attachments/assets/fa6fa62f-da74-4369-9b22-6ce73585d796" />

F. Reflection Section

Implementing these algorithms shows how choice of data structure impacts utility. BFS checks all nearby nodes while DFS checks as far as possible. It was not hard to implement the project.
