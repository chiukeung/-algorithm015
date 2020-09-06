# 第5课
## 哈希表、映射、集合
**哈希表**：根据关键码值进行访问，通过关键码值进行映射，映射函数叫散列函数
**哈希冲突**：解法方法拉链法
Java里使用Map接口存储键值对，key是不重复的
HashMap<>()/TreeMap<>(): HashMap无顺序，TreeMap有顺序
map.put(key, value):设定键值
map.get(key)：根据key取value
map.getOrDefault(key, defaultValue):有key就使用key的value,没有key就用defaultValue
map.containsKey(key):判断key是否存在
map.containsValue(value):判断value是否存在
map.size():map大小
map.isEmpty():是否为空
**遍历map的4种方法**：
1.通过keySet()遍历获取key和value
```
  for (Integer key : map.keySet()) {
   System.out.println("key= "+ key + " and value= " + map.get(key));
  }
```
2.通过Map.entrySet使用iterator遍历key和value
```
Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
  while (it.hasNext()) {
   Map.Entry<Integer, Integer> entry = it.next();
   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
  }
```
3.通过Map.entrySet遍历key和value(推荐)
```
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
  }
```
4.通过Map.values()遍历所有的value，但不能遍历key
```
for (Integer v : map.values()) {
   System.out.println("value= " + v);
  }
```
## 集合
**集合**：无重复元素
new HashSet<>()/TreeSet<>(): HashSet无顺序，TreeSet有顺序
set.add(value): 添加value
set.remove(value):删除value
set.size(): 集合大小
set.isEmpty():是否为空
set.contains(value):是否包含value


# 第6课
## 树、二叉树、二叉搜索树
**树**：一个结点有0至多个后继结点相邻，没有环
链表是特殊化的树，树是特殊化的图
树的层级：根是0层
父节点，子节点，兄弟结点，子树
二叉树：每个结点有0个或两个孩子
**二叉树遍历**：
1.pre-order: 根-左-右
2.in-order: 左-根-右
3.post-order: 左-右-根

**二叉搜索树**：二叉有序树
具有如下性质：
1左子树上的所有结点都小于根结点
2右子树上的所有结点都大于根结点
3左右子树也分别是二次搜索树
二叉搜索树的中序遍历为升序排列

**操作**：
1查询
2插入新节点:插入后保证是二叉搜索树
3删除：删除后要保证是二叉搜索树，需要在右子树中寻找最小的

时间复杂度：O(logN)
树的题解一般都是递归实现，因为树本身就是一个递归结构

## 堆和二叉堆、图

**堆**：在一堆数中找到最大值或最小值的数据结构
大根堆：根最大
小根堆：根最小
二叉堆，斐波那契堆
**二叉堆（大根堆）性质**：
通过二叉树实现
是一颗完全树
树中结点值总是大于等于子结点值
二叉堆实现：
**二叉堆通过数组实现**
假设第一个元素的索引为0，那么父节点和子节点的位置关系如下：
索引为i的左孩子的索引为（2i+1）
索引为i的右孩子的索引为（2i+2）
索引为i的父节点的索引为（floor((i-1)/2)）
**操作**：
1插入：先放到堆尾，然后和其父节点比较大小，依次向上直到比其父节点小为止
2删除：先将堆尾元素替换删除元素的位置，然后依次向下和左右孩子结点比较大小
二叉堆可以用优先队列（PriorityQueue）实现

做题体会：
1.HashMap遍历要采用简便高效写法
2.堆要使用PriorityQueue，并学会重写compare方法
3.二叉树的遍历框架要熟练，递归思路要熟练
4.滑动窗口也是针对一类题目的常用解法

















