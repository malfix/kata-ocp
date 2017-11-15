package it.xpug.ocp.fizzbuzz;


public class FizzBuzzGame implements Game {
    private SayModule[] sayModules;

    public FizzBuzzGame(SayModule... sayModule) {
        this.sayModules = sayModule;
    }

    @Override
    public String say(int number) {
        StringBuilder list = new StringBuilder();
        for (SayModule myHandler : sayModules) {
            myHandler.handle(number, list);
        }
        return (list.length() == 0) ? String.valueOf(number) : list.toString();
    }
}
