/*
 * Complete the function below.
 */

    static String compute(String s) {
        if(s == null || s.length() == 0 || s.isEmpty()) {
            return "";
        }
        if(s.length() == 1) {
            return s;
        }
        Set<String> substringSet = getSubStringSet(s);
        ArrayList<String> list = new ArrayList<>();
        list.addAll(substringSet);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    static Set<String> getSubStringSet(String s) {
        Set<String> result = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if(!result.contains(s.substring(i,j))){
                    result.add(s.substring(i,j));
                }
            }
        }
        return result;
    }

