package ru.mipt.app.control.listeners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;

public class ScoreListener implements ChangeListener<Integer> {

    private Text score;

    public ScoreListener(Text score) {
        this.score = score;
    }

    @Override
    public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
        score.setText("Score: " + t1.toString());
    }
}
