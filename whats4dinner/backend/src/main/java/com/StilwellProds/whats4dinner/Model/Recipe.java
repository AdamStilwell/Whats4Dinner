package Model;

import java.util.ArrayList;

public class Recipe {
    //will be composed of ingredient objects
    //list of strings that has all the steps when the recipe object is created
    ArrayList<String> steps = new ArrayList<>();

    //add the step to this recipe's list
    private void addStepsToList(String step){
        steps.add(step);
    }
    //get the step needed from the list
    private String getStepFromList(int stepNumber){
        return steps.get(stepNumber-1);
    }
}
