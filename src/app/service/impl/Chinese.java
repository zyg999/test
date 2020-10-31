package app.service.impl;

import app.service.Axe;
import app.service.Person;

import java.util.*;

public class Chinese implements Person {
    private List<String> schools;
    private Map<?, ?> scores;
    private Map<String, Axe> phaseAxes;
    private Properties health;
    private Set axes;
    private String[] books;
    private Axe axe;
    public Chinese() {
        System.out.println("Spring实例化主调bean: Chinese实例...");
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public void setScores(Map<?, ?> scores) {
        this.scores = scores;
    }

    public void setPhaseAxes(Map<String, Axe> phaseAxes) {
        this.phaseAxes = phaseAxes;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public void setAxes(Set axes) {
        this.axes = axes;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }


    public void setAxe(Axe axe) {
        this.axe = axe;
    }
    public void useAxe() {
        System.out.println(axe.chop());
    }
    public void test() {
        System.out.println(schools);
        System.out.println(scores);
        System.out.println(phaseAxes);
        System.out.println(health);
        System.out.println(axes);
        System.out.println(Arrays.toString(books));
    }
}
