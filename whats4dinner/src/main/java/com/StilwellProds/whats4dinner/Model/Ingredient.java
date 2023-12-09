package Model;

public class Ingredient {
    //when the ingredient object is created, it must have a measurement associated with it
    Measurements measurement;
    Ingredient(Measurements measurement){
        this.measurement = measurement;
    }

}
