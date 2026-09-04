double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int i = 0, j = 0, k = 0;
    double Middle;
    int NUM[nums1Size + nums2Size];

    while (j < nums1Size && k < nums2Size) {
        if (nums1[j] <= nums2[k])
            NUM[i++] = nums1[j++];
        else
            NUM[i++] = nums2[k++];
    }

    if (j == nums1Size) {
        for (; k < nums2Size; k++)
            NUM[i++] = nums2[k];
    }
    else {
        for (; j < nums1Size; j++)
            NUM[i++] = nums1[j];
    }

    if (i % 2 == 0)
        Middle = (NUM[i / 2 - 1] + NUM[i / 2]) / 2.0;
    else
        Middle = NUM[i / 2];

    return Middle;
}
