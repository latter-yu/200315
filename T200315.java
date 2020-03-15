//psvm  主函数快捷键
//sout  输出快捷键
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
//抛出了 java.lang.ArrayIndexOutOfBoundsException 异常. 使用数组一定要下标谨防越界
//Exception in thread "main" java.lang.NullPointerException(空指针异常)
//null 的作用类似于 C 语言中的 NULL (空指针), 都是表示一个无效的内存位置. 因此不能对这个内存进行任何读写操作.
//一旦尝试读写, 就会抛出 NullPointerException

import java.util.Arrays;

public class T200315 {
    public static void main(String[] args) {
        //数组转字符串
        //Arrays.toString
        int[] arr = {1,2,3,4,5,6};
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
        //[1, 2, 3, 4, 5, 6]
    }
    public static void main6(String[] args) {
        //数组转字符串
        int[] arr = {1,2,3,4,5,6};
        System.out.println(toString(arr));
        //[1, 2, 3, 4, 5, 6]
    }
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            // 借助 String += 进行拼接字符串
            ret += arr[i];
            // 除了最后一个元素之外, 其他元素后面都要加上 ", "
            if (i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main5(String[] args) {
        //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] arr = new int[100];
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int x = i+1;
            System.out.println(x);
        }
    }


    public static void main4(String[] args) {
        //打印每个元素的值
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main3(String[] args) {
        //输出数组的值*2
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ret = transform(arr);
        print(ret);
    }
    public static void print(int[] arr) {
        for(int x : arr) {
            System.out.println(x);
        }
    }
    public static int[] transform(int[] arr) {
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr1[i] = 2*arr[i];
        }
        return arr1;
    }

    public static void main2(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr) {
        //求数组元素的和
        int sum= 0;
        for(int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static void main1(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(avg(arr));
    }
    public static double avg(int[] arr) {
        //求数组元素平均值
        int sum= 0;
        for(int x : arr) {
            sum += x;
        }
        return (double)sum/(double)arr.length;
    }
}
