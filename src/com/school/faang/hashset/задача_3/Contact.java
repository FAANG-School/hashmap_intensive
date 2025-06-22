package com.school.faang.hashset.задача_3;

import java.util.Objects;

public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || this.getClass()!=o.getClass()) {return false;}
        Contact otherContact = (Contact) o;
        return Objects.equals(name, otherContact.name)&&
                Objects.equals(number,otherContact.number);
    }
    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
