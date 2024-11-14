package homework.a31ex1;

import java.util.*;
public class ex1 {
    public static void main( String[] args ) {
        // create a list and intialize it
        //new Double自java9便弃用，现在采用自动装箱来创建对象
        Double[] data = {3.45,-0.2,100.3,89.67,20.3,83.7,10.9,43.58,11.0,23.132};
        //List<Double> list = new ArrayList<>(Arrays.asList(data));
        List<Double> list = Arrays.asList( data );
        Collections.sort(list);
        // iterate to display the set values
        //Iterator<Double> i1 = list.iterator();
        int index;
        //Collections.binarySearch需要一个已排序的列表来正确执行搜索
        index = Collections.binarySearch(
                list,11.0 );
        System.out.println( "Search for 11.0 returns " + index );
        index = Collections.binarySearch(
                list,12.0);
        System.out.println( "Search for 12.0 returns " + index );
    }
}

