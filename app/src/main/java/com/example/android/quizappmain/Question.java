package com.example.android.quizappmain;

import java.util.ArrayList;
import java.util.Objects;

public class Question {
    private String context = "";
    private ArrayList<String> options = new ArrayList<>(  );
    private ArrayList<String> rightAnswerArray = new ArrayList<>(  );
    private ArrayList<String> selectedOptionArray = new ArrayList<>(  );

    public ArrayList<String> getRightAnswer() {
        return rightAnswerArray;
    }

    public void setRightAnswer(ArrayList<String> rightAnswerArray) {
        this.rightAnswerArray = rightAnswerArray;
    }

    public ArrayList<String> getSelectedOption() {
        return selectedOptionArray;
    }

    public void setSelectedOption(ArrayList<String> selectedOptionArray) {
        this.selectedOptionArray = selectedOptionArray;
    }


    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals( context, question.context ) &&
                Objects.equals( options, question.options );
    }

    @Override
    public int hashCode() {
        return Objects.hash( context, options );
    }

}
