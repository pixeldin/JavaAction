package com.pixelpig.woh.basic.patten.IteratorPat.pix;

import com.pixelpig.woh.basic.patten.IteratorPat.Aggregate;
import com.pixelpig.woh.basic.patten.IteratorPat.Iterator;

/**
 * Create by pixelpig
 * 2019/8/5
 */
public class BusStation implements Aggregate {

    private Bus[] buses;
    private int last = 0;

    public BusStation(int size) {
        this.buses = new Bus[size];
    }

    public Bus callBus(int index) {
        return buses[index];
    }

    public void addBus(Bus bus) {
        this.buses[last] = bus;
        last++;
    }

    public int getLength() {
        return last;
    }

    //Changeable for this iterator implement
    public Iterator iterator() {
        //Implement A: Travel all
        //return new IteratorOfBusStation(this);

        //Implement B: Only cass odd code bus
        return new OddIteratorOfBusStation(this);
    }
}
