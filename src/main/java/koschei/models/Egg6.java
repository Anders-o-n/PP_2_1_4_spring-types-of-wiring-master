package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    Needle7 needle7 = new Needle7();

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
