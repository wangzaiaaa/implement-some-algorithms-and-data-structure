
class Trie {
    private int SIZE = 26;
    private TrieNode root;
    class TrieNode{
        private int count;
        private TrieNode [] child;
        private boolean isEnd;
        private char val;
        TrieNode(){
            count = 1;
            child = new TrieNode[SIZE];
            isEnd = false;
        }
    }
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word==null || word.length()<1) return;
        TrieNode temp = root;
        for(int i=0;i<word.length();i++){
            char chr = word.charAt(i);
            int index = chr - 'a';
            
            if(temp.child[index]==null){
                temp.child[index] = new TrieNode();
                temp.child[index].val = chr;
            }else{
                temp.child[index].count++;
            }
            temp = temp.child[index];
        }
        temp.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word==null || word.length()<1) return false;
        TrieNode temp = root;
        for(int i=0;i<word.length();i++){
            char chr = word.charAt(i);
            int index = chr - 'a';
            if(temp.child[index]==null){
                return false;
            }else{
                temp = temp.child[index];
            }
        }
        return temp.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix==null || prefix.length()<1) return false;
        TrieNode temp = root;
        for(int i=0;i<prefix.length();i++){
            char chr = prefix.charAt(i);
            int index = chr - 'a';
            if(temp.child[index]==null){
                return false;
            }else{
                temp = temp.child[index];
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */