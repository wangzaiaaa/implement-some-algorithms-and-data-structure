/**
 * @author bonsoirzw
 * @date 2019/7/4
 * 字典树实现
 */

public class Trietree {
    private int SIZE = 26;
    TrieNode root;
    Trietree(){
        this.root = new TrieNode();
    }
    class TrieNode{
        /**
         * sum ：通过该节点的总数
         * isEnd ：是否是终点
         * son ：儿子节点
         * val ：节点的值
         */
        private int sum;
        private boolean isEnd;
        private TrieNode [] son;
        private char val;

        TrieNode(){
            sum = 1;
            son = new TrieNode[SIZE];
            isEnd = false;
        }
    }

    /**
     * 插入
     * @param str
     */
    public void insert(String str){
        if(str == null || str.length() < 1){
            return;
        }else{
            TrieNode node = root;
            for(int i=0;i<str.length();i++){
                int index = str.charAt(i) - 'a';
                if(node.son[index] == null){
                    node.son[index] = new TrieNode();
                    node.son[index].val = str.charAt(i);
                }else{
                    node.son[index].sum++;
                }
                node = node.son[index];
            }
            node.isEnd = true;
        }
    }

    /**
     * 计算前缀的数量
     * @param str
     * @return
     */
    public int countPrefix(String str){
        if(str == null || str.length() < 1){
            return 0;
        }else{
            TrieNode node = root;
            for(int i=0;i<str.length();i++){
                int index = str.charAt(i) - 'a';
                if(node.son[index] == null){
                    return 0;
                }else{
                    node = node.son[index];
                }
            }
            return node.sum;
        }
    }

    /**
     * 找到经过此节点的所有节点
     * @param node
     * @param prefix
     */
    public void preTraverse(TrieNode node,String prefix){
        if(!node.isEnd){
            for(TrieNode child : node.son){
                if(child != null){
                    preTraverse(child,prefix + child.val);
                }
            }
        }
        System.out.println(prefix);
    }

    /**
     * 打印前缀的所有单词
     * @param prefix
     */
    public void printTraverse(String prefix){
        if(prefix == null || prefix.length() < 1) return;
        TrieNode node = root;
        for(int i=0;i<prefix.length();i++){
            int index = prefix.charAt(i) - 'a';
            if(node.son[index] == null) return;
            node = node.son[index];
        }
        preTraverse(node,prefix);
    }

    /**
     * 找到完全匹配的单词
     */

    public boolean canFind(String str){
        if(str == null || str.length() < 1) return false;
        TrieNode node = root;
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i) - 'a';
            if(node.son[index] == null){
                return false;
            }else{
                node = node.son[index];
            }
        }
        return node.isEnd;
    }

    public int countAll(TrieNode node){
        if(node == null || node.son == null) return 0;
        int count = 0;
        for(TrieNode child : node.son){
            if(child != null){
                if(child.isEnd) count++;
                else{
                    count += countAll(child);
                }
            }
        }
        return count;
    }
    public int countAll(){
        return countAll(root);
    }

    public static void main(String[] args) {
        String [] strs = {"leetcode","java","jawa","dsffwe"};
        Trietree tree = new Trietree();
        for(String str : strs){
            tree.insert(str);
        }
        System.out.println(tree.countAll());
        tree.printTraverse("ja");
        System.out.println(tree.canFind("jav"));
    }




}
