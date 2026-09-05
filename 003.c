#盛最多水容器
#define MIN(a,b) ((a)<(b)?(a):(b))
#define MAX(a,b) ((a)>(b)?(a):(b))
int maxArea(int* height, int heightSize) {
    int left = 0, right = heightSize - 1, ans = 0, area, k;
    while (left < right) {
        area = (right - left) * MIN(height[left], height[right]);
        ans = MAX(ans, area);
        height[left] < height[right] ? left++ : right--;
    }
    return ans;
}