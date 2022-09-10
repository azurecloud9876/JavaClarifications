package com.behavioral.Observer.exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public interface Subject {

    /**
     * Add Observer Method
     *
     * @param observer observer
     */
    void addObserver(Observer observer);

    /**
     * Remove an observer method
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * Notify all observers of this subject
     */
    void notifyAllObservers();
}
