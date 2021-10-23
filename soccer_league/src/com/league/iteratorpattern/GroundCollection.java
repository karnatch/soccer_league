package com.league.iteratorpattern;

public class GroundCollection implements Collection
{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Ground[] g;

    public GroundCollection()
    {
        g = new Ground[MAX_ITEMS];

        addGround("Estadio la vista has been made available for hosting");
        addGround("Red zone04 has been made available for hosting");
        addGround("Sparrow stadium has been made available for hosting");

    }

    public void addGround(String str)
    {
        Ground c = new Ground(str) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            g[numberOfItems] = c;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator()
    {
        return new GroundIterator(g);
    }

}

