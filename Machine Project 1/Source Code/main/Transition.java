package main;

import java.util.ArrayList;

public class Transition {
    private String fromState;
    private ArrayList<String> toState;
    private ArrayList<String> outputs;

    public Transition(String fromState) {
        this.fromState = fromState;
        this.toState = new ArrayList<String>();
        this.outputs = new ArrayList<String>();
    }

    public String getFromState() {
        return fromState;
    }

    public void setFromState(String fromState) {
        this.fromState = fromState;
    }

    public ArrayList<String> getToState() {
        return toState;
    }

    public void setToState(ArrayList<String> toState) {
        this.toState = toState;
    }

    public ArrayList<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(ArrayList<String> response) {
        this.outputs = response;
    }
    
    public void addResponseState(String toState, String response){
        this.toState.add(toState);
        this.outputs.add(response);
    }
    
    public void addOutput(String response){
        this.outputs.add(response);
    }
}
