package com.pixelpig.woh.basic.patten.IteratorPat.pix;

import com.pixelpig.woh.basic.patten.IteratorPat.Iterator;

/**
 * Create by pixelpig
 * 2019/8/5
 */

//Specific implement of iterator for bus
public class IteratorOfBusStation implements Iterator {
    private BusStation busStation;
    private int index;

    public IteratorOfBusStation(BusStation busStation) {
        this.busStation = busStation;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < busStation.getLength();
    }

    @Override
    public Object next() {
        Bus bus = busStation.callBus(index);
        index++;
        return bus;
    }
}
