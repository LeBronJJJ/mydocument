package com.revision.BinTree;

import java.util.Stack;

/**
 * 前序遍历
 */
public class PreOrderRe {
    public static void main(String[] args) {
        /**
         * 先以数组形式创建10个node
         * 用for对每一个都赋予对象
         * 单数作为左子树
         * 复数右子树
         */
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for (int i = 0; i < 10; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i * 2 + 1 < 10)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 10)
                node[i].right = node[i * 2 + 2];
        }

        preOrderRe(node[0]);
        System.out.println();
        preOrder(node[0]);
    }

    public static void preOrderRe(TreeNode biTree) {//递归实现
        /**
         * 每次先打印根节点的值
         * 然后将左子树划分数来
         * 判断是否为空并继续递归左子树
         * 若左子树为空 再递归右子树
         */
        System.out.println(biTree.value);
        TreeNode leftTree = biTree.left;
        if (leftTree != null) {
            preOrderRe(leftTree);
        }
        TreeNode rightTree = biTree.right;
        if (rightTree != null) {
            preOrderRe(rightTree);
        }
    }

    public static void preOrder(TreeNode biTree) {//非递归实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (biTree != null || !stack.isEmpty()) {
            while (biTree != null) {
                System.out.println(biTree.value);
                stack.push(biTree);
                biTree = biTree.left;
            }
            if (!stack.isEmpty()) {
                biTree = stack.pop();
                biTree = biTree.right;
            }
        }
    }
}

class TreeNode//节点结构
{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
}


