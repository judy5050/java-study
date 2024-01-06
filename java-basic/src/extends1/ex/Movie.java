package extends1.ex;

import extends1.ex1.Item;

public class Movie extends Item {

    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("-감독:" + director+", 배우:" + actor);
    }
}
