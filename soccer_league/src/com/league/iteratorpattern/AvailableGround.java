package com.league.iteratorpattern;

public class AvailableGround
{
    GroundCollection c;

    public AvailableGround(GroundCollection c)
    {
        this.c = c;
    }

    public void availableGrounds()
    {
        Iterator iterator = c.createIterator();
        System.out.println("-------The following grounds are available for hosting games ------------");
        while (iterator.hasNext())
        {
            Ground g = (Ground)iterator.next();
            System.out.println(g.getGround());
        }
    }
}


