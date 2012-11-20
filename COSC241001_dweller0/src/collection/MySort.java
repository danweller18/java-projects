/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author Daniel
 */
public class MySort {

    public static void swap(MyVector vec, int first, int second) {
        Object temp = vec.elementAt(first);
        vec.replace(first, vec.elementAt(second));
        vec.replace(second, temp);
    }

    public static MyVector bubbleSort(MyVector vec) {

        int i, j, n = vec.size();
        Comparable first, second;
        for (i = 1; i < n; i++) {

            for (j = n - 1; j >= i; --j) {
                first = (Comparable) vec.elementAt(j - 1);
                second = (Comparable) vec.elementAt(j);

                if (first.compareTo(second) > 0) {
                    swap(vec, j - 1, j);
                }
            }
        }
        return vec;
    }

    public static MyVector selectionSort(MyVector vec) {
        int i, j, n = vec.size();
        int smallpos;
        Comparable smallest, current;
        for (i = 0; i < n - 1; ++i) {
            smallpos = i;
            smallest = (Comparable) vec.elementAt(i);

            for (j = i + 1; j < n; ++j) {
                current = (Comparable) vec.elementAt(j);

                if (current.compareTo(smallest) < 0) {
                    smallpos = j;
                    smallest = current;
                }

            }
            if (smallpos != i) {
                swap(vec, i, smallpos);
            }
        }
        return vec;
    }

    public static void mergeSort(MyVector vec, Comparable[] temp, int left, int right) {

        
        if (left == right) {
            return;
        }

        //mid equals middle

        int mid = (left + right) / 2, i, j, k;
        mergeSort(vec, temp, left, mid);
        mergeSort(vec, temp, mid + 1, right);
        for (j = left; j <= right; j++) {
            temp[j] = (Comparable) vec.elementAt(j);
        }

        i = left;
        k = mid + 1;
        for (j = left; j <= right; j++) {
            if (i == mid + 1) {
                vec.replace(j, temp[k++]);
            } else {
                if (k > right) {
                    vec.replace(j, temp[i++]);
                } else {
                    if ((temp[i]).compareTo(temp[k]) < 0) {
                        vec.replace(j, temp[i++]);
                    } else {
                        vec.replace(j, temp[k++]);
                    }
                }
            }

        }

    }

    public static void insertionSort(MyVector vec, int left, int right) {
        int inner, outer;
        Object target;

        for (outer = left + 1; outer <= right; outer++) {
            target = vec.elementAt(outer);
            inner = outer;
            while (inner > left && ((Comparable) vec.elementAt(inner - 1)).compareTo(target) > 0) {
                vec.replace(inner, vec.elementAt(inner - 1));
                inner--;
            }
            vec.replace(inner, target);
        }
    }

    public static void shellSort(MyVector vec) {
        int inner, outer;
        Object target;
        int h = 1;
        while (h <= vec.size() / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (outer = h; outer < vec.size(); outer++) {
                target = vec.elementAt(outer);
                inner = outer;
                while (inner > h - 1 && ((Comparable) vec.elementAt(inner - h))
                        .compareTo(target) > 0) {
                    vec.replace(inner, vec.elementAt(inner - h));
                    inner = inner - h;
                }
                //end of inner while loop
                vec.replace(inner, target);
            }
            //end of for loop
            h = (h - 1) / 3;
        }
        //end of outer while loop
    }
    //end of method

    public static void quickSort(MyVector vec, int left, int right) {
        
        if (right - left < 10) {
            insertionSort(vec, left, right);
        } else {
            medianOf3(vec, left, right);
            int leftPar = partition(vec, left, right);
            quickSort(vec, left, leftPar - 1);
            quickSort(vec, leftPar, right);
        }
    }
    
    public static void medianOf3(MyVector vec, int left, int right){
	
	int middle = (left + right) /2;
	if(((Comparable)vec.elementAt(left)).compareTo(vec.elementAt(middle)) > 0){
		swap(vec, left, middle);
	}
        
	if(((Comparable)vec.elementAt(middle)).compareTo(vec.elementAt(right)) > 0){
		swap(vec, middle, right);
	}
        
	if(((Comparable)vec.elementAt(left)).compareTo(vec.elementAt(middle)) > 0){
		swap(vec, left, middle);
	}
        
    }
    
    public static int partition(MyVector vec, int left, int right){
	Object pivot = vec.elementAt((left + right) / 2);
            while(true){
                while(((Comparable)vec.elementAt(++left)).compareTo(pivot) < 0);
    //when there is a ; at the end of the line of a loop, it ends itself
                while(((Comparable)vec.elementAt(--right)).compareTo(pivot) > 0);
                    if(left > right){
                    break;
                    }
                    else{
                        swap(vec, left, right);
                    }
            } 
   //end of the outer while loop
        return left;
    }

}