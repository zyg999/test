package app.service.impl;

import app.service.Axe;
import org.springframework.stereotype.Component;

@Component
public class SteelAxe implements Axe {
    @Override
    public String chop() {
        return "铁斧砍柴好快";
    }
}
