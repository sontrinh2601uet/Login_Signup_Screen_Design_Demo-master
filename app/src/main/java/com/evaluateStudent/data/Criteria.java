package com.evaluateStudent.data;

import java.util.ArrayList;

public class Criteria extends DataEvaluate{

    private String standardName;
    private ArrayList<Action> listAction;

    public Criteria(String name, int iconId, String content) {
        super(name, iconId, content);

        listAction = new ArrayList<>();
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public ArrayList<Action> getListAction() {
        return listAction;
    }

    public void setListAction(ArrayList<Action> listAction) {
        this.listAction = listAction;

        for (Action action : listAction) {
            action.setCriteriaName(this.getName());
        }
    }
}
