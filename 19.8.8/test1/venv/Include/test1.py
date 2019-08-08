
#s= input('请输入一段内容：')
#print("s:",s)
#s1 = input('请输入一段内容：')
#需要转换类型  因为  input返回值为字符串
#print("s1 + 1:",  int(s1) + 1)
#
# a = 1
# b = 2
# print(1/2)

# a = 100
# b = 100
# print(a ** b)
#
# a = 1
# b = 2
# c = 3
# print(a < b and b < c)
#
# a = 'hh'
# b = 'haha'
# print(a == b)
#
# a = 'abc'
# b = 'bcd'
# print(a < b)
#
# num = 10
# print(++num)

#列表(list) 其中的元素可以存不同的类型  java是因为Object类 可以存 py本身支持这样的操作
# a = [9,5,2,7]
# a[0] = 100
# print(a[-1])
# print(a)


#元组(tuple)  也可以填不同的类型  列表和元组的区别  列表时可变对象，元组是不可变对象
# a = (9,5,2,7)
#a[1] = 100   就会报错
# print(a[2])

#整数在py中也不能修改
#a = 10   a = 20  并不是修改a  而是修改了关联关系
#a = 'hhh' a[0] = 'z' 会报错  说明并不是修改变量本身

#字典 键值对结构  类似于java中的hashmap 底层也是map写的  类似json的结构
# a = {
#     'ip':'127.0.0.1',# 环回ip  自己访问自己  测试用的
#     'port': '8080'
# }
#这样类似于hashMap中的查找  时间复杂度O(1) 通过映射把key存起来  哈希冲突怎么办 开散列：找下一个key
#   闭散列：不行就接链表
# print(a['ip'])


#引用
# a = 'hehe'
# b = a
# print(a)
# print(b)
#
# print(id(a))
#print(id(b))

# a = 'abc'
# b = 'def'
# c = '---'
# print(a + b)
# print(3*c)

# name = input("请输入姓名:")
# print("姓名为：" , name)
# a = 9
# b = 2
# print(a // b)

# a = 100
# b = 100
# print(a ** b)

#a为列表
# a = [1,2,3,4]
# print(a)
# #列表和元组都能保存任意类型的Python对象
# a = [111,222,'hhh']
# print(a)
# #可以使用下标来访问列表和元组的元素，从0开始，最后一个下标为-1
# print(a[0])
# a[1] = 666
# #唯一的区别，列表的元素可更改，元组不能
# print(a)
# #b为元组
# b = (1,2,3,4)
# print(b)
# print(b[-1])

# a = 10
# # print(id(a))
# # a = 20
# # print(id(a))
# #
# # a = 'hhh'
# # a[0] = 6
# # print(a)

for i in range(0, 100, 2):
 print (i)