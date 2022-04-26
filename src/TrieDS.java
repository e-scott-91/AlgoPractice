public class TrieDS {
    private Node root;

    public TrieDS() {
        root = new Node('/');
    }
    public void insert(String word) {
        Node curr = root;
        for (int i =0; i< word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node (c);
            }
            curr = curr.children[c - 'a'];
        }
    }

    private Node getNode(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c -'a'] == null) return null;
            curr = curr.children[c -'a'];
        }
        return curr;
    }

    public boolean search(String word) {
        Node end = getNode(word);
        if (end != null && end.isWord) return true;
        else return false;
    }

    public boolean startsWith(String word) {
        Node end = getNode(word);
        if (end != null) return true;
        else return false;
    }

    class Node {
        char c;
        boolean isWord;
        Node[] children;

        public Node(char c) {
            this.c = c;
            isWord = false;
            children = new Node[26];
        }
    }
}
