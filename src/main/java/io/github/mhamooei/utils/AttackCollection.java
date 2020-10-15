package io.github.mhamooei.utils;

import io.github.mhamooei.models.Attack;

import java.util.Collection;

public class AttackCollection {
    /**
     *
     * @param collection is a list of attack's objects
     * @param attack is a string attack which is searched in collection
     * @return if collection contains attack it's true otherwise it's false
     */
    public static boolean containsAttack(Collection<? extends Attack> collection , String attack){
        return collection.stream().anyMatch(a -> a.getAttack().equals(attack));
    }
}
