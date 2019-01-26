


 

import java.util.LinkedList;

import java.util.Queue;

 

public class TreeNode <T>{

 

    //ÿ���ڵ㶼�����ҽ��͵�ǰ�Ľڵ��ֵ

    T value;

    TreeNode<T> leftchild;

    TreeNode<T> rightchild;

    TreeNode(T a){

        this.value = a;

    }

 

    //����ս��

    TreeNode(){

 

    }

 

    //������ӽ��

    public void addleft(T v){

        this.leftchild = new TreeNode<T>(v);

    }

 

    //������ӽ�㲢�����ӽ��û��ֵʱ

    public void addleft(){

        this.leftchild = new TreeNode<>();

    }

 

    //����Һ��ӽ��

    public void addright(T v){

        this.rightchild = new TreeNode<T>(v);

    }

 

    //������ӽ�㲢�����ӽ��û��ֵʱ

    public void addright(){

        this.rightchild = new TreeNode<>();

    }

 

    //�õ�����

    public static <T> TreeNode<T> getLeftchild(TreeNode<T> tree){

        if(tree==null||tree.leftchild==null) return null;

        else return tree.leftchild;

    }

 

    //�õ��ҽ��

    public static <T> TreeNode<T> getRightchild(TreeNode<T> tree){

        if(tree==null||tree.rightchild==null) return null;

        else return tree.rightchild;

    }

 

 

    //��дequals����

    public boolean equals(Object o){

        if(!(o instanceof TreeNode)) return false;

        return ((TreeNode) o).value == this.value;

 

    }

 

    //�õݹ�õ�������Ŀ

    public static <T> int getTreeNum(TreeNode<T> tree){

        if(tree==null) return 0;

        else return 1 + getTreeNum(tree.leftchild) + getTreeNum(tree.rightchild);

    }

 

    //�õ�����������

    public static <T> int getMaxLength(TreeNode<T> tree){

        if(tree == null) return 0;

        else{

            int MaxlengthOfLeft=1,MaxLengthOfRight=1;

            return Math.max(MaxlengthOfLeft+getMaxLength(tree.leftchild),MaxLengthOfRight+getMaxLength(tree.rightchild));

        }

    }

 

    //��ʾ��ǰ���

    public static <T> void showCurrentNode(TreeNode<T> tree){

        if(tree == null)return;

        System.out.print(tree.value+" ");

    }

    //������� ��������

    public static <T> void PreOrderTravel(TreeNode<T> tree){

        if(tree==null) return;

        else{

            showCurrentNode(tree);

            PreOrderTravel(tree.leftchild);

            PreOrderTravel(tree.rightchild);

 

        }

    }

 

    //������� �������

    public static <T> void MidOrderTravel(TreeNode<T> tree){

        if(tree == null) return;

        else{

            MidOrderTravel(tree.leftchild);

            showCurrentNode(tree);

            MidOrderTravel(tree.rightchild);

 

        }

    }

 

    //������� �����Ҹ�

    public static <T> void BackOrderTravel(TreeNode<T> tree){

        MidOrderTravel(tree.leftchild);

        MidOrderTravel(tree.rightchild);

        showCurrentNode(tree);

 

    }

 

    //����α�����Ҳ���Ըĳɹ������������

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

 

    //Ҷ�ӽ��ĸ���

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

        System.out.println("�������tree ");

        PreOrderTravel(test);

        System.out.println();

        System.out.println("�������tree ");

        MidOrderTravel(test);

        System.out.println();

        System.out.println("�������tree ");

        BackOrderTravel(test);

        System.out.println();

        System.out.println("��α���");

        LayelTraverse(test);

        System.out.println();

        System.out.print("the leaf of test is "+getLeafNum(test));

    }

}
