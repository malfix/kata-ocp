package it.xpug.ocp.fizzbuzz;

public class GameFactory {
    public Game create() {
        return new FizzBuzzGame(new SayModule(3, "Fizz"), new SayModule(5, "Buzz"), new SayModule(7, "Bang"));
    }
}
