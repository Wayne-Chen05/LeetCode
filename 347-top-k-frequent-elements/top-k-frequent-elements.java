class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0) 
        {
            return new int[0];
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
        {
            int value = nums[i];
            if (seen.contains(value))
            {
                continue;
            }

            int count = 0;
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[j] == value)
                {
                    count++;
                }
            }

            frequencyMap.put(value, count);
            seen.add(value);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(entries, Collections.reverseOrder(Map.Entry.comparingByValue()));
        int[] results = new int[k];
        for (int i = 0; i < k; i++)
        {
            results[i] = entries.get(i).getKey();
        }

        return results;
    }
}