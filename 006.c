//最接近的三数之和
int comp(const void* a, const void* b) { return *(int*)a - *(int*)b; }
int threeSumClosest(int* nums, int numsSize, int target) {
    qsort(nums, numsSize, sizeof(int), comp);
    int i, k, j, best = 1e7;
    for (i = 0;i < numsSize;i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        j = i + 1, k = numsSize - 1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == target) {
                return target;
            }
            if (abs(sum - target) < abs(best - target)) {
                best = sum;
            }
            if (sum > target) {
                int k0 = k - 1;
                while (j < k0 && nums[k0] == nums[k]) {
                    k0--;
                }
                k = k0;
            }
            else {
                int j0 = j + 1;
                while (j0 < k && nums[j0] == nums[j]) {
                    j0++;
                }
                j = j0;
            }
        }
    }

    return best;
}