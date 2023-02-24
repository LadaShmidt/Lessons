package Tree;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int value){
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static int maxDepth(TreeNode root){ // метод принимает в свои парметры дерево
        if(root == null){ // если ветки  пустые,
            return 0;// то возращаем 0
        }else{// иначе
            int leftDepth = maxDepth(root.left); // создаем переменную int, который присваиваем максимальное значение одной ветки
            int rightDepth = maxDepth(root.right);// создаем вторую переменную int и ей присваиваем максимальное значение второй ветки
            return Math.min(leftDepth, rightDepth) + 1; // возвращаем с помощью метода Math.max наибольшее значение из двух принт переменных.
        }
    }
}
