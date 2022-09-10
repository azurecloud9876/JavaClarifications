package com.behavioral.Observer.exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public interface Observer {

    /**
     * Update method: receives the notification from the subject
     *
     * @param message
     */
    void update(String message);
}
