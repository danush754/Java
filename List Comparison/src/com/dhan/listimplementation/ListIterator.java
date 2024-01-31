package com.dhan.listimplementation;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface ListIterator extends Iterator<Object>{

    boolean hasPrevious();

    Object previous();

    void set(Object e);

     void remove();
}