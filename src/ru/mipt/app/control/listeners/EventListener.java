package ru.mipt.app.control.listeners;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Iterator;
import java.util.List;

public class EventListener implements EventHandler<ActionEvent> {

    private List<Runnable> actions;

    public EventListener(List<Runnable> actions) {
        this.actions = actions;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Iterator<Runnable> iter = actions.iterator();
        while (iter.hasNext()) {
            iter.next().run();
        }
    }
}
