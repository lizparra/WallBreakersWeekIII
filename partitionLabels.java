class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] end = new int[26];
        
        for (int j = 0; j < S.length(); j++) {
            end[S.charAt(j) - 'a'] = j;
        }

        List<Integer> list = new ArrayList<>();

        for (int j = 0, i = j; j < S.length(); i = j) {
            for (int max = j; j <= max; j++) {
                max = Math.max(max, end[S.charAt(j) - 'a']);
            }

            list.add(j - i);
        }

        return list;
    }
}
