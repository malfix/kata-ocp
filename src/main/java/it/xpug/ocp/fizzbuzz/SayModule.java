package it.xpug.ocp.fizzbuzz;

/**
 * Created by emalfara on 15/11/17.
 */
public class SayModule {
    private int module;
    private String say;

    public SayModule(int module, String say) {
        this.module = module;
        this.say = say;
    }

    public void handle(int number, StringBuilder whatSay){
        if (number % module == 0) whatSay.append(say);
    }
}
