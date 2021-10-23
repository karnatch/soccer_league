package com.league.iteratorpattern;


class GroundIterator implements Iterator
{
    Ground[] groundList;

    int pos = 0;

    public  GroundIterator (Ground[] groundList)
    {
        this.groundList = groundList;
    }

    public Object next()
    {
        Ground gl =  groundList[pos];
        pos += 1;
        return gl;
    }

    public boolean hasNext()
    {
        if (pos >= groundList.length ||
                groundList[pos] == null)
            return false;
        else
            return true;
    }
}
