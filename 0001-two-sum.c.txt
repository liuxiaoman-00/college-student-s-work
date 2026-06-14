/*题目：两数之和
   日期：2026-6-14
   方法：暴力枚举*/
int* twoSum(int* nums, int numsSize, int target, int* returnSize) 
{
    int i,j;
    for(i=0;i<numsSize;i++)
    for(j=i+1;j<numsSize;j++)
    {
        if(nums[i]+nums[j]==target)
        {
           int*ret=(int*)malloc(sizeof(int)*2);
            ret[0]=i;
            ret[1]=j;
            *returnSize=2;
            return ret;
        }
    }
    *returnSize=0;
    return NULL;
}
