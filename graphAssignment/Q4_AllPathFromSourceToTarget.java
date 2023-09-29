package graphAssignment;

import java.util.ArrayList;
import java.util.List;

public class Q4_AllPathFromSourceToTarget {
    public static void main(String[] args) {
//        int[][] graph = {{1, 2}, {3}, {3}, {}};
        int[][] graph = {{4,3,1}, {3,2,4}, {3}, {4},{}};
        List<List<Integer>> ans = allPathsSourceTarget(graph);
        System.out.println(ans);
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfsSearch(graph, 0, res, path);
        return res;
    }

    static void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
        if (node == graph.length - 1) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfsSearch(graph, nextNode, res, path);
            path.remove(path.size() - 1);
        }
    }
}
