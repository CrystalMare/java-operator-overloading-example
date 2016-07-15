package net.heavencraft.operators;

/**
 * Interface for adding objects together
 * @param <T> the type that is added
 */
public interface Add<T> {

    /**
     * Allows operator overloading for adding
     *
     * @param object the object to add
     * @return the result
     */
    T add(T object);

}
