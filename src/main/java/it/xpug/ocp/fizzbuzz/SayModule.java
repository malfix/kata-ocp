package it.xpug.ocp.fizzbuzz;

/**
 * Created by emalfara on 15/11/17.
 */
public class MyHandler {
    private int module;
    private String say;

    public MyHandler(int module, String say) {
        this.module = module;
        this.say = say;
    }

    public void handle(int number, StringBuilder whatsay){
        if (number % module == 0) whatsay.append(say);
    }
}
