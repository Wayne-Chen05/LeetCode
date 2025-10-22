class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
        {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (!anagramGroups.containsKey(sortedString)) 
            {
                anagramGroups.put(sortedString, new ArrayList<>());
            }

            anagramGroups.get(sortedString).add(str);

        }

        return new ArrayList<>(anagramGroups.values());

    }
}