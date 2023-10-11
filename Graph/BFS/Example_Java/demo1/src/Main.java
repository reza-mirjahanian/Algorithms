

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    String name;
    boolean visited = false;
    ArrayList<Node> neighbors;

    Node(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighborNode) {
        this.neighbors.add(neighborNode);
    }
}

class Main {

    public static void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        node.visited = true;

        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.name + " ");

            for (Node neighbor : n.neighbors) {
                if (!neighbor.visited) {
                    q.add(neighbor);
                    neighbor.visited = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");

        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeC);
        nodeB.addNeighbor(nodeD);
        nodeB.addNeighbor(nodeE);

        bfs(nodeA);
    }
}