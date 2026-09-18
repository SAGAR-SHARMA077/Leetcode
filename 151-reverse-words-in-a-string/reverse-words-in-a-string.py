class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        data = s.split()
        data.reverse()
        return " ".join(data )  