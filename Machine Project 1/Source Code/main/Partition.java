package main;

import java.util.ArrayList;

public class Partition {
    private String label;
    private ArrayList<String> states;
    private ArrayList<String> outputs;
    private ArrayList<Transition> transTable;
   
    public Partition(ArrayList<String> outputs, String label) {
        this.outputs = outputs;
        this.label = label;
        this.states = new ArrayList<String>();
        this.transTable = new ArrayList<Transition>();
    }

    public ArrayList<String> getStates() {
        return states;
    }

    public void setStates(ArrayList<String> states) {
        this.states = states;
    }

    public ArrayList<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(ArrayList<String> outputs) {
        this.outputs = outputs;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public ArrayList<Transition> getTransTable() {
        return transTable;
    }

    public void setTransTable(ArrayList<Transition> transTable) {
        this.transTable = transTable;
    }
    
    
    public void addState(String state){
        this.states.add(state);
    }
    
    public void addTransition(Transition trans){
        this.transTable.add(trans);
    }
}
