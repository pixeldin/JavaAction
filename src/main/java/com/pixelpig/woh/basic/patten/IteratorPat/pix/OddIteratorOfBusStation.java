package com.pixelpig.woh.basic.patten.IteratorPat.pix;

import com.pixelpig.woh.basic.patten.IteratorPat.Iterator;

/**
 * Create by pixelpig
 * 2019/8/5
 */

//Implement calling of odd code bus
public class OddIteratorOfBusStation implements Iterator {
    private BusStation busStation;
    private int index;

    public OddIteratorOfBusStation(BusStation busStation) {
        this.busStation = busStation;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < busStation.getLength();
    }

    @Override
    public Object next() {
        if (index % 2 != 0) {
            Bus bus = busStation.callBus(index);
            index++;
            return bus;
        } else {
            index++;
            return null;
        }
    }
}
