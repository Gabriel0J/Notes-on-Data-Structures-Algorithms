public class Models {
    //How would you represent a tic tak toe board in code?
    //  2d array of booleans   [No- we need a ternary model]
    //  2d array of integers   [Not the end of the world]
    //  1d array of integers   [Best option]
    //  2d array of strings    [Worst option- model is numbers oriented, doesn't work well with strings]
    //the internal representation of the game is 99.9% of the time going to be different
    //from what the user sees
    //ternary model - each box on the board can be 3 values - x, o, _
    //Model (numbers oriented) should be kept separate from the view (graphically oriented)
    //MVC architecture [Apple]
    //Model - talks to controller
    //View - talks to controller
    //Controller - talks to model and view
    //talks means through methods/ calling methods within the other
    //Architecture is good when implementing new features, or finding and removing bugs

    //If you think a project may be a boolean model, it may actually be a trinary model
}