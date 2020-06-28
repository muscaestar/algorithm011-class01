# 学习笔记

这周很忙，刚好作业中5题曾写过，把简单中等难度每题重新过了一遍。

剩余时间做了课堂内容总结：

## 第3课 课堂总结
### 数组 Array
在内存中开辟一段连续的地址，直接通过内存管理器访问元素
- 访问时间复杂度O(1)
- 插入和删除操作：时间复杂度O(n)，因为需要群移操作

Java的ArrayList实现：ensureCapacity 和 System.arraycopy

### 链表 Linked List
链表的每一个元素有value和next两个变量，next指向下一个元素
- 双向链表：每一个元素有value，next，prev三个变量
- 循环链表：尾部元素的next指向头部元素

Java的LinkedList实现：是双向链表，元素为内部类Entry<T>

- 插入操作：前继节点next指向新节点，新节点next指向后继节点，时间复杂度O(1)
- 删除操作：插入的逆操作
- 在插入删除操作频繁的情况下，链表优于数组
- 访问中间元素的时间复杂度O(n)

### 数组和链表时间复杂度比较
|Operation|Array|LinkedList|
|---|---|---|
|prepend|*O(n) / O(1)|O(1)|
|append|*O(n) / O(1)|O(1)|
|lookup|O(1)|O(n)|
|insert|O(n)|O(1)|
|delete|O(n)|O(1)|

*由是否预留空位决定

### 跳表 Skip List
加速有序链表的查找操作，基于有序链表实现，用升维的思想，增加多级索引

- 插入/删除/搜索的时间复杂度：O(log n)
- 空间复杂度：O(n)

在元素不多的情况下用来替代平衡树(AVL Tree)，如Redis

维护成本高，每次插入删除操作需要更新所有索引

#### 时间复杂度分析
- 第k级索引的节点个数：n/(2^k)
- 索引高度：logn
- 查询任意数据的时间复杂度为O(log n)


### 工程应用
- LRU缓存机制
- Redis的跳表

## 第4课 课堂总结
### 栈 Stack
先入后出，添加删除O(1)，单纯查询O(n)
### 队列 Queue
先入先出，添加删除O(1)，单纯查询O(n)
### 双端队列 Deque
看作栈和队列的结合体，添加删除O(1)，单纯查询O(n)
Java的Deque接口API
### 优先队列 Priority Queue
- 插入操作：O(1)
- 取出操作：O(logN) 按照元素优先级取出
- 底层由堆Heap实现
