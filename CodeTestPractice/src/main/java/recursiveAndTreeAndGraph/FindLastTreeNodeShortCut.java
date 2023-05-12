package recursiveAndTreeAndGraph;

public class FindLastTreeNodeShortCut {

    public int solution(int level, Node node) {
        if (node.lt == null && node.rt == null) {
            return level;
        } else {
            return Math.min(solution(level + 1, node.lt), solution(level + 1, node.rt));
        }
    }

    public static void main(String[] args) {
        FindLastTreeNodeShortCut findLastTreeNodeShortCut = new FindLastTreeNodeShortCut();
        Node tree = new Node(1);
        tree.lt = new Node(2);
        tree.rt = new Node(3);
        tree.lt.lt = new Node(4);
        tree.lt.rt = new Node(5);
        System.out.println(findLastTreeNodeShortCut.solution(0, tree));

    }

    static class Node {


        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }


}

