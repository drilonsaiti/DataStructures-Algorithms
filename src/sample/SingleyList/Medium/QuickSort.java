package sample.SingleyList.Medium;

public class QuickSort {

    public static SLL<Integer> quickSort(SLL<Integer> list,SLLNode<Integer> first,SLLNode<Integer> last){
        if(first != null && last != null){
            SLLNode p = partition(list,first,last);
            quickSort(list,first,p);
            quickSort(list,p.succ,last);
        }
        return list;

    }

    public static SLLNode<Integer> partition(SLL<Integer> list,SLLNode<Integer> first,SLLNode<Integer> last){
        SLLNode<Integer> firstNode = first;
        SLLNode<Integer> ptr = firstNode.succ;

        while (ptr != null){
            if(ptr.element.compareTo(firstNode.element)<0){
                int pivot = firstNode.element;
                firstNode.element = ptr.element;
                ptr.element = firstNode.succ.element;
                firstNode.succ.element = pivot;
                firstNode = firstNode.succ;
            }
            ptr = ptr.succ;
        }
        return firstNode;
    }
}
