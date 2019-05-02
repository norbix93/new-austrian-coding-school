package week10.exercise1;

public class Pokemon {

    String name;
    String type1;
    String type2;
    Integer total;
    Integer HP;
    Integer attack;
    Integer defence;
    Integer specialAttack;
    Integer specialDefence;
    Integer speed;
    Integer generation;
    Boolean legendary;

    public Pokemon(String name, String type1, String type2, Integer total,
                   Integer HP, Integer attack, Integer defence, Integer specialAttack,
                   Integer specialDefence, Integer speed, Integer generation, Boolean legendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.HP = HP;
        this.attack = attack;
        this.defence = defence;
        this.specialAttack = specialAttack;
        this.specialDefence = specialDefence;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getSpecialAttack() {
        return specialAttack;
    }

    public Integer getSpecialDefence() {
        return specialDefence;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Boolean getLegendary() {
        return legendary;
    }
}
