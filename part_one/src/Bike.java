public class Bike {

    /*
     * Setting attributes for the bike class
     */
    private String colour;
    private String model;

    public Bike() {
    }

    public Bike(String color, String model) {
        this.colour = color;
        this.model = model;
    }

    /*
    This method return a String object
    We don't pass any parameters in because we are just want to obtain a parameter of object
     */
    public String getColour() {
        return colour;
    }

    /*
    it is void, because we don't want to return anything
    we are passing a parameter to the method because we want to set a colour to a specific value (the one we are passing in)
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /*
    This method override a toString method.
    It returns a String.
     */
    @Override
    public String toString() {
        return ("The colour of the bike is \"" + this.colour +"\" and the model is \"" + this.model + "\".");
    }
}
