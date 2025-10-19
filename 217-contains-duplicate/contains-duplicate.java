class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet seen = new HashSet<>();
        for (int num : nums)
        {
            if (!seen.add(num))
            {
                return true;
            }
        }
        return false;
    }
}