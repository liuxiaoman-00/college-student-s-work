//三数之和
static int cmp(const void* a, const void* b) {
    return *(int*)a - *(int*)b;
}
int** threeSum(int* nums, int numsSize, int* returnSize, int** returnColumnSizes) {
    qsort(nums, numsSize, sizeof(int), cmp);
    int** ans = (int**)malloc(sizeof(int*) * numsSize * numsSize);
    *returnColumnSizes = (int*)malloc(sizeof(int*) * numsSize * numsSize);
    int m, n = 0;
    for (int i = 0;i < numsSize - 2;i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        int left = i + 1;
        int right = numsSize - 1;
        while (left < right) {
            m = nums[i] + nums[left] + nums[right];
            if (m == 0) {
                int* tuple = (int*)malloc(sizeof(int) * 3);
                tuple[0] = nums[i];
                tuple[1] = nums[left];
                tuple[2] = nums[right];
                ans[n] = tuple;
                (*returnColumnSizes)[n] = 3;
                n++;
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
            }
            else if (m < 0) left++;
            else if (m > 0) right--;
        }
    }
    *returnSize = n;
    return ans;
}