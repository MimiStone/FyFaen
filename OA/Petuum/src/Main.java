public class Main {
    static int tmp_count = 0;
    static int max_count = 0;
    static final int[] x_off = {1, -1, 0, 0};
    static final int[] y_off = {0, 0, 1, -1};
    public static void dfs(int i, int j, int[][] matrix) {
        int search  = matrix[i][j];
        matrix[i][j] = -1;
        tmp_count++;
        for(int off = 0; off < 4; off++) {
            int new_x = i + x_off[off];
            int new_y = j + y_off[off];
            if(valid(matrix, new_x, new_y) && matrix[new_x][new_y] == search) {
                dfs(new_x, new_y, matrix);
            }
        }
    }

    public static boolean valid(int[][] matrix, int x,  int y){
        if(x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length) {
            return true;
        }
        return false;
    }

    public static int solution(int[][] input){
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[0].length; j++){
                if(input[i][j] != -1){
                    tmp_count = 0;
                    dfs(i, j, input);
                    max_count = Math.max(tmp_count, max_count);
                }
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[][] input = {{0, 0, 1, 0, 0},
                         {0, 1, 1, 0, 0},
                         {0, 1, 0, 0, 1}};
        int[][] input1 = {{0, 1, 2, 3},
                          {2, 2, 2, 1},
                          {0, 4, 4, 1}};
        System.out.println(solution(input1));
    }
}
