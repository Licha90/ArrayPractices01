public class BubbleSort {

    public static void main(String[] args) {

        //冒泡排序法
        //当前元素与前一个元素进行比较大小 如果当前元素如果小于前一个元素 就发生一次位置的互换

        int[] sortArray = {5,2,3,1,4};

        //a[4]-a[3]
        //a[3]-a[2]
        //a[2]-a[1]
        //a[1]-a[0]

        for (int i = 1; i <= 4; i++){//控制比较轮次 每一轮出来一个最小值

            for (int j = 4; j >= i; j--){//从数组的低端一直比到顶端,每比一轮就少比一次

                if(sortArray[j] < sortArray[j-1]){//当前元素<前一个元素

                    int x = sortArray[j];
                    sortArray[j] = sortArray[j-1];//位置互换
                    sortArray[j-1] = x;

                }
            }
        }
        for (int v : sortArray) {
            System.out.println(v);
        }
    }
}
