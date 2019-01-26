


 

import java.util.LinkedList;

import java.util.Queue;

 

public class TreeNode <T>{

 

    //每个节点都有左右结点和当前的节点的值

    T value;

    TreeNode<T> leftchild;

    TreeNode<T> rightchild;

    TreeNode(T a){

        this.value = a;

    }

 

    //构造空结点

    TreeNode(){

 

    }

 

    //添加左孩子结点

    public void addleft(T v){

        this.leftchild = new TreeNode<T>(v);

    }

 

    //添加左孩子结点并且左孩子结点没有值时

    public void addleft(){

        this.leftchild = new TreeNode<>();

    }

 

    //添加右孩子结点

    public void addright(T v){

        this.rightchild = new TreeNode<T>(v);

    }

 

    //添加左孩子结点并且左孩子结点没有值时

    public void addright(){

        this.rightchild = new TreeNode<>();

    }

 

    //得到左结点

    public static <T> TreeNode<T> getLeftchild(TreeNode<T> tree){

        if(tree==null||tree.leftchild==null) return null;

        else return tree.leftchild;

    }

 

    //得到右结点

    public static <T> TreeNode<T> getRightchild(TreeNode<T> tree){

        if(tree==null||tree.rightchild==null) return null;

        else return tree.rightchild;

    }

 

 

    //重写equals方法

    public boolean equals(Object o){

        if(!(o instanceof TreeNode)) return false;

        return ((TreeNode) o).value == this.value;

 

    }

 

    //用递归得到结点的数目

    public static <T> int getTreeNum(TreeNode<T> tree){

        if(tree==null) return 0;

        else return 1 + getTreeNum(tree.leftchild) + getTreeNum(tree.rightchild);

    }

 

    //得到树的最大深度

    public static <T> int getMaxLength(TreeNode<T> tree){

        if(tree == null) return 0;

        else{

            int MaxlengthOfLeft=1,MaxLengthOfRight=1;

            return Math.max(MaxlengthOfLeft+getMaxLength(tree.leftchild),MaxLengthOfRight+getMaxLength(tree.rightchild));

        }

    }

 

    //显示当前结点

    public static <T> void showCurrentNode(TreeNode<T> tree){

        if(tree == null)return;

        System.out.print(tree.value+" ");

    }

    //先序遍历 ：根左右

    public static <T> void PreOrderTravel(TreeNode<T> tree){

        if(tree==null) return;

        else{

            showCurrentNode(tree);

            PreOrderTravel(tree.leftchild);

            PreOrderTravel(tree.rightchild);

 

        }

    }

 

    //中序遍历 ：左根右

    public static <T> void MidOrderTravel(TreeNode<T> tree){

        if(tree == null) return;

        else{

            MidOrderTravel(tree.leftchild);

            showCurrentNode(tree);

            MidOrderTravel(tree.rightchild);

 

        }

    }

 

    //后序遍历 ：左右根

    public static <T> void BackOrderTravel(TreeNode<T> tree){

        MidOrderTravel(tree.leftchild);

        MidOrderTravel(tree.rightchild);

        showCurrentNode(tree);

 

    }

 

    //按层次遍历（也可以改成广度优先搜索）

    public static <T> void LayelTraverse(TreeNode<T> tree){

        if(tree==null) return;

        Queue<TreeNode<T>> queue = new LinkedList<>();

        queue.offer(tree);

        while(queue.peek()!=null){

            TreeNode<T> temp = queue.poll();

            System.out.print(temp.value+" ");

            if(temp.leftchild!=null)

                queue.offer(temp.leftchild);

            if(temp.rightchild!=null)

                queue.offer(temp.rightchild);

        }

    }

 

    //叶子结点的个数

    public static <T> int getLeafNum(TreeNode<T> tree){

        if(tree==null) return 0;

        if(tree.leftchild==null&&tree.rightchild==null) return 1;

        return getLeafNum(tree.leftchild)+getLeafNum(tree.rightchild);

    }

 

 

    public static void main(String [] args){

        TreeNode<Integer> test = new TreeNode<>(1);

        test.addleft(2);

        test.addright(3);

        TreeNode<Integer> firstLeftChild = getLeftchild(test);

        firstLeftChild.addleft(4);

        firstLeftChild.addright(5);

        TreeNode<Integer> secondLeftChild = getLeftchild(firstLeftChild);

        secondLeftChild.addleft(6);

        System.out.print("the deepth of test is "+getMaxLength(test)+"\n");

        System.out.print("the total num of node test is "+getTreeNum(test));

        System.out.println();

        System.out.println("先序遍历tree ");

        PreOrderTravel(test);

        System.out.println();

        System.out.println("中序遍历tree ");

        MidOrderTravel(test);

        System.out.println();

        System.out.println("后序遍历tree ");

        BackOrderTravel(test);

        System.out.println();

        System.out.println("层次遍历");

        LayelTraverse(test);

        System.out.println();

        System.out.print("the leaf of test is "+getLeafNum(test));

    }

}
