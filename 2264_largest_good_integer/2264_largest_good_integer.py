class Solution(object):
    def largestGoodInteger(self, num):
        for digit in "9876543210":
            pattern = digit * 3
            if pattern in num:
                return pattern
        return ""
