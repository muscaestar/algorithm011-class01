# 学习笔记
## 泛型递归代码模版
```
public void recur(int level, int... params) {
    // terminator
    if (level > MAX_LEVEL) {
        // process result
        return;
    }   
    
    // process current logic
    process(level, param);
    
    // drill down
    recur(level: level+1, newParam);

    //restore current status
}
```
## 递归Tips
1. 不要人肉递归
2. 找最近最简子问题，重复子问题
3. 数学归纳法思维

## 分治，回溯
都是用递归来实现的

### 分治模版
```
public void devide_conquer(problem, int... params) {
    // terminator
    if (problem == null) {
        // process result
        return;
    }

    // prepare data
    data = prepare_data(problem);
    subproblems = split(probleam, date);

    // conquer subproblems
    subresult1 = devide_conquer(subproblems[0], p1...);
    subresult2 = devide_conquer(subproblems[1], p1...);
    ...

    // merge subresults
    result = process_result(subresult1, subresult2, ...);

    // restore current status
}

```
