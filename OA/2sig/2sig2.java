/*
 * Complete the function below.
 */

    static int longestChain(String[] words) {
        if(words == null || words.length == 0) {
            return 0;
        }
        int result = 0;
        Arrays.sort(words, new Comparator<String>(){
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words) {
            map.put(word, 1);
        }
        for(String word : words) {
            updateMap(map, word);
        }
        return Collections.max(map.values());

    }

    static void updateMap(HashMap<String, Integer> map, String word) {
        for(int i = 0; i < word.length(); i++){
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(i);
            String newWord = sb.toString();
            if(map.containsKey(newWord)) {
                map.put(newWord, Math.max(map.get(newWord), map.get(word) + 1));
            }
        }
    }

