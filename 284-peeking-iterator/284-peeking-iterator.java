// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
import java.util.NoSuchElementException;

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> ite;
    Integer peekedValue = null;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.

        ite = iterator;

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {


        if(peekedValue == null) {
            if(!ite.hasNext()) {
                throw new NoSuchElementException();
            }

           peekedValue = ite.next();
        }
        return  peekedValue;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
              if(peekedValue != null) {
            int val = peekedValue;
            peekedValue = null;
            return val;
        }

        if(!ite.hasNext()) {
            throw new NoSuchElementException();
        }
       return ite.next();

    }

    @Override
    public boolean hasNext() {

        return peekedValue != null || ite.hasNext();

    }
}