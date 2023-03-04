class Solution:
    def reverse(self, x: int) -> int:
        if x < 0: # 判断是否为负数
            return -self.reverse(-x) # 如果是负数则取绝对值调用自身，最后将结果转为负数
        res = 0
        while x: # 每次得到最后一位数字，并将其作为结果中的当前最高位
            res = res * 10 + x % 10
            x //= 10
        return res if res <= 0x7fffffff else 0 # 如果溢出就返回0