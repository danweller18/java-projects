/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author Daniel
 */
public class MySet extends MyVector implements Cloneable {

    //@return
    //@parameter
    //this returns the number of elements in the set
    public int cardinality() {
        return size();

    }

    //this finds the set, then return the opposite of the set(this set - set B)
    public MySet complement(MySet SetD) {
        MySet SetC = new MySet();
        MySet setD = SetD;
        for (int i = 0; i < cardinality(); i++) {
            if (!SetD.contains(elementAt(i))) {
                SetC.insert(elementAt(i));
            }
        }
        return SetC;
    }

    public boolean contains(Object element) {
        return super.contains(element);
    }

//this will add a new element into the set at the begining of the set
    public boolean insert(Object element) {
        if (contains(element)){ 
            return false;    
        } 
        else {
            super.append(element);
            return true; 
        }
    }

    //this will find the set and find what is this set & set B
    public MySet intersection(MySet SetD) {
        MySet SetC = new MySet();
        MySet setD = SetD;
        for (int i = 0; i < cardinality(); i++) {
            if (SetD.contains(elementAt(i))) {
                SetC.insert(SetD);
            }
        }
        return SetC;
    }

    //This will find whether this set is a subset of set B or not
    public boolean subsetOf(MySet SetD) {
        for (int i = 0; i < cardinality(); i++) {
            if (SetD.contains(elementAt(i))) {
                return false;
            }
        }
        return true;
    }

    //This will find this set, then take this set-setB or setB - this set
    public MySet symmetricDifference(MySet SetD) {
        MySet SetC = this.complement(SetD);
        MySet SetE = SetD.complement(this);
        return SetC.union(SetE);
    }

    //This will find this set union B (or B)
    public MySet union(MySet SetD) {
        MySet SetF = (MySet) SetD.clone();
        for (int i = 0; i < cardinality(); i++) {
            SetF.insert(elementAt(i));
        }
        return SetF;
    }
    
    public Object clone() {
        MySet vecCopy = new MySet();
        for (int i = 0; i < size(); ++i) {
            vecCopy.data[i] = this.data[i];
        }
        return vecCopy;
    }
}

