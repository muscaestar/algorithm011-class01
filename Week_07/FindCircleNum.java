public class FindCircleNum {

    public static void main(String[] args) {
        FindCircleNum findCircleNum = new FindCircleNum();
        int circleNum = findCircleNum.findCircleNum(new int[][]{{1, 1, 0}, {1,1,0}, {0, 0, 1}});
        System.out.println(circleNum);
    }

    public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] == 1) {
                    unionFind.union(i,j);
                }
            }
        }
        return unionFind.getCount();
    }
}
