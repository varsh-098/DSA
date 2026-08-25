class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashSet<Integer> processed = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (processed.contains(nums[i])) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            freq.put(nums[i], count);
            processed.add(nums[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {

            int max = 0;
            int maxelem = 0;

            for (int num : freq.keySet()) {

                if (freq.get(num) > max) {
                    max = freq.get(num);
                    maxelem = num;
                }
            }

            result.add(maxelem);
            freq.remove(maxelem);
        }

        int a[] = new int[k];

        for (int i = 0; i < k; i++) {
            a[i] = result.get(i);
        }

        return a;
    }
}