package com.cenfotec.accessingdatamongodb;

import org.springframework.data.annotation.Id;


public class Order {

    @Id
    public String id;

    public String name;
    public String color;
    public String size;
    public String description;

    public Order() {}

    public Order(String name, String color, String size, String description) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Order[id=%s, name='%s', color='%s', size='%s', description='%s']",
                id, name, color, size, description);
    }

}