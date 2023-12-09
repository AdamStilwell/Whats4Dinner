package Model;

public class Ingredient {
    //when the ingredient is created, it will also have a value associated with it i.e. 1 tbsp of onion, the value will be 1 the measurement will be TABLESPOON, the type will be onion
    Integer value;
    Measurements measurement;

    Ingredient(Integer value, Measurements measurement){
        this.value = value;
        this.measurement = measurement;
    }

}
