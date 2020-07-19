# 学习笔记
## 深度优先DFS递归模版
```
Set<Node> visited = new HashSet<>();
public void dfsRecur(Node node, Set visited) {
    // terminator
    if (visited.contains(node)) {
        return;
    }

    visited.add(node);
    // process current node
    
    // drill down
    for (Node next : node.children) {
        if (!visited.contains(node)) {
            dfsRecur(next, visited);
        }
    }
}
```
## 深度优先DFS迭代模版
```
public void dfsIter(Node root) {
    if (root == null) {
        return new ArrayList<>();
    }

    Set<Node> visited = new HashSet<>();
    Deque<Node> stack = new LinkedList<>(); 
    stack.addFirst(root);

    while (!stack.isEmpty()) {
        Node curr = stack.removeFirst();
        visited.add(curr);

        // process curr

        while () {
            stack.addFirst(...);
        }

        // other process
    }
}
```
## 广度优先BFS迭代模版
```
public void bfs(Node start, Node end) {
    Set<Node> visited = new HashSet<>();
    Deque<Node> queue = new LinkedList<>(); 
    queue.addLast(start);

    while (!queue.isEmpty()) {
        Node curr = queue.pollFirst();
        visited.add(curr);

        // process curr

        while () {
            queue.addFirst(...);
        }

        // other process
    }
}
```
## 贪心算法
- 每一步选择中都采取当前状态下最优的选择，希望得到全局最优的结果。
- 局限：并不一定能得到全局最优解

### 贪心 VS 动态规划
- 贪心：对每个子问题的解决方案都做出选择，不能回退
- 动规：保存以前的运算结果，根据以前的结果对当前进行选择，有回退功能
#### 贪心回溯动规
- 贪心：当下做出局部最优判断
- 回溯：能够回退
- 动规：最优判断 + 回退

## 贪心常见问题
- 图中的最小生成树
- 求哈夫曼编码
- ！！注意：工程中的实际问题，很少可以用贪心算法得最优解
- 作为辅助算法得近似最优

## 贪心的适用场景
- 问题能够分解成子问题，子问题最优解能递推到最终问题的最优解。这种子问题最优解成为**最优子结构**

## 二分查找
### 前提条件
1. 目标函数单调性（单调递增或递减）
2. 存在上下界(bounded)
3. 能够通过索引访问(index accessible)

### 代码模版
```
int target = ...;
int left = 0;
int right = nums.length - 1;
while (left <= right) {
    mid = (left + right) / 2;
    if (nums[mid] == target) {
        // find the target
        // break or return
    } else if (nums[mid] < target) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}

```