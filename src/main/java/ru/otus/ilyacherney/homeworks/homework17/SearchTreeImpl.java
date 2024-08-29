package ru.otus.ilyacherney.homeworks.homework17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class SearchTreeImpl<T extends Comparable<T>> implements SearchTree<T> {

    private TreeNode<T> root;

    public SearchTreeImpl(List<T> sortedList) {
        root = buildSearchTree(sortedList, 0, sortedList.size() - 1);
    }

    private TreeNode<T> buildSearchTree(List<T> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = start + (end - start) / 2;
        TreeNode<T> treeNode = new TreeNode<>(sortedList.get(middle));
        treeNode.left = buildSearchTree(sortedList, start, middle - 1);
        treeNode.right = buildSearchTree(sortedList, middle + 1, end);
        return treeNode;
    }

    @Override
    public T find(T element) {
        TreeNode<T> node = findRecursive(root, element);
        return (node != null) ? node.value : null;
    }

    private TreeNode<T> findRecursive(TreeNode<T> treeNode, T element) {
        if (treeNode == null) {
            return null;
        }
        if (element.compareTo(treeNode.value) == 0) {
            return treeNode;
        } else if (element.compareTo(treeNode.value) < 0) {
            return findRecursive(treeNode.left, element);
        } else {
            return findRecursive(treeNode.right, element);
        }
    }

    @Override
    public List<T> getSortedList() {
        List<T> list = new ArrayList<>();
        List<T> sortedList = (List<T>) getSmallestNode(list, root);
        return sortedList;
    }

    public List<T> getSmallestNode(List<T> sortedList, TreeNode<T> treeNode) {
        if (treeNode != null) {
        System.out.println(sortedList);
        System.out.println(treeNode.value);
            getSmallestNode(sortedList, treeNode.left);
            sortedList.add(treeNode.value);
            getSmallestNode(sortedList, treeNode.right);
        }
        return sortedList;
    }

    @Override
    public String toString() {
        return "SearchTreeImpl{" +
                "root=" + root.toString() +
                '}';
    }
}