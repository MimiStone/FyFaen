/*
 * Complete the function below.
 */

    static int moves(int[] a) {
        int result = 0;
        
        int i = 0, j = a.length - 1;
        while( i  < j ) {
            while(i  < j && a[i] % 2 == 0) {
                i++;
            }
            while(i   < j && a[j] % 2 == 1) {
                j--;
            }
            System.out.println(i);
            System.out.println(j);
            if(i < j) {
               swap(a, i, j);
               result++;
               i++;
               j--; 
            }
            
        }
        return result;
    }

    static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

