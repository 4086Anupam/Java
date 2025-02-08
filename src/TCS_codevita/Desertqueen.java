package TCS_codevita;

import java.util.*;

public class Desertqueen {

    public static int calcStringValue(List<Pair<String, String>> edges, List<String> inputString) {
        Map<String, List<String>> adjacencyList = new HashMap<>();
        Set<String> children = new HashSet<>();
        Set<String> nodes = new HashSet<>();

        for (Pair<String, String> edge : edges) {
            adjacencyList.putIfAbsent(edge.getFirst(), new ArrayList<>());
            adjacencyList.get(edge.getFirst()).add(edge.getSecond());
            children.add(edge.getSecond());
            nodes.add(edge.getFirst());
            nodes.add(edge.getSecond());
        }

        String root = "";
        for (String node : nodes) {
            if (!children.contains(node)) {
                root = node;
                break;
            }
        }

        if (root.isEmpty()) {
            return -1;
        }

        Map<String, Integer> levels = new HashMap<>();
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 1));

        while (!queue.isEmpty()) {
            Pair<String, Integer> current = queue.poll();
            String node = current.getFirst();
            int level = current.getSecond();
            levels.put(node, level);

            if (adjacencyList.containsKey(node)) {
                for (String child : adjacencyList.get(node)) {
                    if (!levels.containsKey(child)) {
                        queue.add(new Pair<>(child, level + 1));
                    }
                }
            }
        }

        int totalValue = 0;
        for (String word : inputString) {
            totalValue += levels.getOrDefault(word, -1);
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEdges = scanner.nextInt();
        scanner.nextLine();

        List<Pair<String, String>> edges = new ArrayList<>();
        for (int i = 0; i < numEdges; i++) {
            String parent = scanner.next();
            String child = scanner.next();
            edges.add(new Pair<>(parent, child));
        }
        scanner.nextLine();

        String inputLine = scanner.nextLine();
        List<String> inputString = Arrays.asList(inputLine.split("\\s+"));

        int result = calcStringValue(edges, inputString);
        System.out.println(result);
    }
}

class Pair<K, V> {
    private final K first;
    private final V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
