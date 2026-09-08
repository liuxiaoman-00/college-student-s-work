//最长公共前缀
char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0) return "";
    char* Lgt = (char*)malloc(sizeof(char) * 201);
    int flag = 0;
    int k = 0;
    for (int i = 0;i < strlen(strs[0]);i++) {
        for (int j = 1;j < strsSize;j++) {
            if (strs[0][i] != strs[j][i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) Lgt[k++] = strs[0][i];
        else break;
    }
    Lgt[k] = '\0';
    return Lgt;
}