class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        st = strs[0]
        ans = ""
        for i in range(len(st)):
            check = st[i]
            for j in range(1,len(strs)):
                if(len(strs[j]) <= i):
                    return ans
                curr = strs[j][i]
                if(check != curr):
                    return ans
            ans +=check
        return ans