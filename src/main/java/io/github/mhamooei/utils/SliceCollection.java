package io.github.mhamooei.utils;

import io.github.mhamooei.models.Slice;

import java.util.Collection;

public class SliceCollection {
    /**
     *
     * @param collection is a list of slice's objects
     * @param slice is a string sub tree which is searched in collection
     * @return if collection contains sub tree it's true otherwise it's false
     */
    public static boolean containsSlice(Collection<? extends Slice> collection , String slice){
        return collection.stream().anyMatch(a -> a.getTree().equals(slice));
    }
}
