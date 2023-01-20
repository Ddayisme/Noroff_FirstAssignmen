package org.example.Character;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    public List<T> Equipment = new ArrayList<T>();

    public void populate(T t){
        Equipment.add(t);
    }
}
