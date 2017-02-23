package main;

import java.util.ArrayList;

public class Machine {
    private ArrayList<String> states;
    private ArrayList<String> inputs;
    private ArrayList<String> outputs;
    private ArrayList<Transition> transTable;

    public Machine(ArrayList<String> states, ArrayList<String> inputs, ArrayList<String> outputs, ArrayList<Transition> transTable) {
        this.states = states;
        this.inputs = inputs;
        this.outputs = outputs;
        this.transTable = transTable;
    }

    public ArrayList<String> getStates() {
        return states;
    }

    public void setStates(ArrayList<String> states) {
        this.states = states;
    }

    public ArrayList<String> getInputs() {
        return inputs;
    }

    public void setInputs(ArrayList<String> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(ArrayList<String> outputs) {
        this.outputs = outputs;
    }

    public ArrayList<Transition> getTransTable() {
        return transTable;
    }

    public void setTransTable(ArrayList<Transition> transTable) {
        this.transTable = transTable;
    }
}
