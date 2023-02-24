package BinaryRoot;
import java.util.ArrayList;
import java.util.List;
public class Min {
 private class Node {
  int value;
  Node left;
  Node right;

  public Node(int value) {
   this.value = value;
   left = null;
   right = null;
  }
 }
 private Node root;

 public void inorderTraversal(Node node, List<Integer> result) {
  if (node == null) {
   return;
  }
  inorderTraversal(node.left, result);
  result.add(node.value);
  inorderTraversal(node.right, result);
 }

 public int[] toArray() {
  List<Integer> result = new ArrayList<>();
  inorderTraversal(root, result);
  int[] array = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   array[i] = result.get(i);
  }
  int maxNumber = 0;
  int minNumber = 0;
  for(int i = 0; i < array.length; i++) {
   if (array[i] != 0) {
    minNumber = array[i];
   } else if (array[i] > minNumber) {
    maxNumber = array[i];
   }
  }
  int subtraction = maxNumber - minNumber;
  System.out.println(subtraction);
   return array;
 }
 }

