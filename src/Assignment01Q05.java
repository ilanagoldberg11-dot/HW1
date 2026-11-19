public class Assignment01Q05 {
    public static int findShortestPath(int[][] matrix, int i, int j) {
        if (i == j) {
            return 0;
        }

        int n = matrix.length; 
        
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;

        boolean[] visited = new boolean[n];
        
        int[] distances = new int[n];

        queue[tail++] = i;  
        visited[i] = true;   
        distances[i] = 0;   

        while (head < tail) {
            int current = queue[head++]; 

            for (int v = 0; v < n; v++) {
                if (matrix[current][v] == 1 && !visited[v]) {
                    visited[v] = true;
                    distances[v] = distances[current] + 1; 

                    if (v == j) {
                        return distances[v];
                    }

                    queue[tail++] = v;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}