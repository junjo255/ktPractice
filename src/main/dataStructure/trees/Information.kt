package main.dataStructure.trees

/**
 https://bit.ly/3gDKc1J

 ###### An Intro to Trees and Basic Tree Properties! ######
 - Trees consist of vertices (nodes) and edges that connect them.
 - Hierarchical.

 - Root Node: A node with no parent nodes.
 - Child Node: A node linked to an upper node (Parent Node).
 - Parent Node: A node that has links to one or more Child Node.
 - Sibling Node: Nodes that share the same Parent Node.
 - Leaf Node: A node that doesn's have any Child Node
 - Ancestor Nodes: The nodes on the path from a node d to the root node. Ancestor nodes
        include node d's parents, grandparents, and so on.

 - Depth of a node n: The length of the path from a node n to the root node.
 - Height of a Tree: Height of its root node.


 - Tree Types:
     - Binary Trees
     - Binary Search Trees
     - AVL Trees
     - Red-Black Trees
     - 2-3 Trees


 ###### What Makes a Tree 'Balanced'? ######
 - A binary tree is height-balanced if, for each node in the tree, the difference between
   the height of the right subtree and the left subtree is, at most, one.
 -  | Height(leftSubTree) - Height(RightSubTree) | <= 1


 ###### What is a Binary Tree? ######
 - Types of Binary Trees:
    - Complete Binary Trees: A complete binary tree is a binary tree in which all the levels
           of the there are fully filled, except for perhaps the last level which can be filled
           from left to right.
           - The total number of nodes in a complete binary tree can be expressed as:
              2^h <= total number of nodes <= 2^(h+1) - 1

    - Full Binary Trees: A full or proper Binary Tree has the following characteristics:
        - Every node has 0 or 2 children. No node can have 1 child.
        - The total number of nodes in a Full Binary Tree of height 'h' can be expressed as:
              2h + 1 <= total number of nodes <= 2^(h+1) - 1

    - Perfect Binary Trees: A Binary Tree is said to be perfect if it is both full and complete.
        - The total number of nodes in a perfect binary tree of height 'h', is given as: 2^(h+1) - 1
        - The total numbe rof leaf nodes are given as 2^h or (n+1)/2

 */