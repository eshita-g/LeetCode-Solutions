class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        // creating the graph
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        // calculate number of nodes in each vertex subtree
        int[] countArr = new int[n];
        countNodes(graph, 0, countArr, new boolean[n]);

        int[] distance = new int[n];
        // calculating root distance i.e. 0
        distance[0] = rootDistance(graph, 0, countArr, new boolean[n]);

        // calculating all vertices distances
        calDistances(graph, 0, countArr, new boolean[n], distance);

        return distance;
    }

    private int countNodes(ArrayList<Integer>[] graph, int src, int[] countArr, boolean[] vis){
        vis[src] = true;
        int c = 1;
        for(int nbr : graph[src]){
            if(vis[nbr]==false){
                c += countNodes(graph, nbr, countArr, vis);
            }
        }
        countArr[src] = c;
        return c;
    }

    private int rootDistance(ArrayList<Integer>[] graph, int src, int[] countArr, boolean[] vis){
        vis[src] = true;
        int dist = 0;
        for(int nbr : graph[src]){
            if(vis[nbr]==false){
                dist += rootDistance(graph, nbr, countArr, vis) + countArr[nbr];
            }
        }
        return dist;
    }

    private void calDistances(ArrayList<Integer>[] graph, int src, int[] countArr, boolean[] vis, int[] distance){
        vis[src] = true;
        for(int nbr : graph[src]){
            if(vis[nbr]==false){
                distance[nbr] = distance[src] + graph.length - 2*countArr[nbr];
                calDistances(graph, nbr, countArr, vis, distance);
            }
        }
    }
}