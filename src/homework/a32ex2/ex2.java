package homework.a32ex2;

import java.util.*;
public class ex2
{
    public static void main(String[] args)
    {
        LinkedList<CStu> objLList1 = new LinkedList<>();

        CStu obj1 = new CStu(14007,"李小清",85);
        CStu obj2 = new CStu(14004,"陈大华",87);
        CStu obj3 = new CStu(14002,"黄大维",75);
        CStu obj4 = new CStu(14006,"林大勇",92);
        CStu obj5 = new CStu(14009,"吴大熊",61);
        CStu obj6 = new CStu(14012,"周志勇",95);
        CStu obj7 = new CStu(14008,"林霏霏",57);
        CStu obj8 = new CStu(14001,"方志耀",73);

        objLList1.add(obj1);
        objLList1.add(obj2);
        objLList1.add(obj3);
        objLList1.add(obj4);
        objLList1.add(obj5);
        objLList1.add(obj6);
        objLList1.add(obj7);
        objLList1.add(obj8);



        Comparator<CStu> objComp1= CMyComparator1::compare;  //排序依据1
        objLList1.sort(objComp1);



        ListIterator<CStu> objListItr1 = objLList1.listIterator();
        System.out.println("学号递增显示:");
        while(objListItr1.hasNext()){
            objListItr1.next().showData();
        }


        Comparator<CStu> objComp2 = CMyComparator2::compare;  //排序依据2
        objLList1.sort(objComp2);


        ListIterator<CStu> objListItr2=objLList1.listIterator();
        System.out.println("成绩递增显示:");
        while(objListItr2.hasNext()){
            objListItr2.next().showData();
        }

    }
}

