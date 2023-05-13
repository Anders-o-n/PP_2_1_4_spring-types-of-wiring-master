package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    Egg6 egg6 = new Egg6();
    @Override
    public String toString() {
        return ", в утке яйцо " + egg6.toString();
    }
}
