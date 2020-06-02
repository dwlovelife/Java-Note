package datastructures.recursion;

/**
 * 迷宫问题
 */
public class Maze {
    public static void main(String[] args) {
        //先创建一个二维数组模拟迷宫
        //地图
        int[][] map = new int[8][7];

        //使用1表示墙
        //上下全部置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        //左右全部置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        //设置挡板,1表示
        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    // 使用递归回溯来给小球找路
    //说明
    //1. map 表示地图
    //2. i,j 表示从地图的哪个位置开始出发(1,1)
    //3. 如果小球能到map(6,5) 位置,说明通路找到.
    //4. 约定: 当map[i][j] 为0,表示该点没有走过 当为1的时候表示墙,2表示通路可以走,3表示该点已经走过,但是走不通
    //5. 在走迷宫时, 需要确定一个策略(方法) 下->右->上->左,如果该点走不通,再回溯
    /**
     * @param map 表示地图
     * @param i   i,j 表示从地图的哪个位置开始出发(1,1)
     * @param j
     * @return 如果找到通路, 就返回true, 否则返回false
     */
    public static boolean setWay(int[][] map, int i, int j) {
        if(map[6][5] == 2){
            return true;
        }else{
            if(map[i][j] == 0){
                //TODO
            }
        }
        return false;
    }

}
