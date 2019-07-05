class Tree{
        Tree [] son;
        Tree(){
            son = new Tree [2];
        }
}
class Solution {
    private Tree root = new Tree();
    public int findMaximumXOR(int[] nums) {
        if(nums == null || nums.length < 1) return 0;
        for(int num : nums){
            insert(root,num);
        }
        return findMaxResult(root,nums);
    }
    
    public void insert(Tree Node,int num){
        Tree temp = Node;
        for(int i=31;i>=0;i--){
            int index = (num >> i) & 1;
            if(temp.son[index] == null){
                temp.son[index] = new Tree();
            }
            temp = temp.son[index];
        }
    }
    
    public int findMaxResult(Tree Node,int [] nums){
        int res = 0;
        for(int num : nums){
            int cur = 0;
            Tree temp = Node;
            for(int i=31;i>=0;i--){
                int index = (num >> i) & 1;
                
                if(temp.son[index^1] != null){
                    cur += (1 << i);
                    temp = temp.son[index^1];
                }else{
                    temp = temp.son[index];
                }
            }
            res = res > cur ? res : cur;
            
        }
        return res;
    }
    
   
}