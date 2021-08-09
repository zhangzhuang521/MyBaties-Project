package com.itcast.domain;

public class Card {
    private Integer id;
    private Double num;

    private Person p;

    public Card() {
    }

    public Card(Integer id, Double num, Person p) {
        this.id = id;
        this.num = num;
        this.p = p;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", num=" + num +
                ", p=" + p +
                '}';
    }
}
