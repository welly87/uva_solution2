package com.company.mst;

public class IntegerPair implements Comparable {
    Integer _first, _second;

    public IntegerPair(Integer f, Integer s) {
        _first = f;
        _second = s;
    }

    public int compareTo(Object o) {
        if (!this.first().equals(((IntegerPair) o).first()))
            return this.first() - ((IntegerPair) o).first();
        else
            return this.second() - ((IntegerPair) o).second();
    }

    public Integer first() {
        return _first;
    }

    public Integer second() {
        return _second;
    }
}
