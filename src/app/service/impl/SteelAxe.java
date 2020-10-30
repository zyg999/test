package app.service.impl;

import app.service.Axe;

public class SteelAxe implements Axe {
    @Override
    public String chop() {
        return "铁斧砍柴好快";
    }
}
