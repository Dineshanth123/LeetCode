/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        Node clone = new Node(node.val);       
        map.put(node, clone);                  
        queue.offer(node);                     

        while(!queue.isEmpty()){
            Node current = queue.poll();       
            for(Node neighbor:current.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor,new Node(neighbor.val));
                    queue.offer(neighbor);     
                }
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);    
    }
}