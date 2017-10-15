/*
 * Complete the function below.
 */

    static int findMinGates(int[] arrivals, int[] departures, int flights) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);
        int result = 1, max = 1;
        int i = 1, j = 0;
        while(i < flights && j < flights) {
            if(arrivals[i] <= departures[j]) {
                result++;
                max = Math.max(result, max);
                i++;
            } else {
                result--;
                j++;
            }
        }
        return max;
    }

