package com.pixelpig.woh.basic.patten.IteratorPat.pix;

import com.pixelpig.woh.basic.patten.IteratorPat.Iterator;

/**
 * Create by pixelpig
 * 2019/8/5
 */
public class TranSport {

    public static void main(String[] args) {

        int BUS_SIZE = 10;
        BusStation busStation = new BusStation(BUS_SIZE);
        for (int i = 0; i < 10; i++) {
            Bus bus = new Bus(String.valueOf(i));
            busStation.addBus(bus);
        }
        Iterator busItor = busStation.iterator();
        while (busItor.hasNext()) {
            Bus bus = (Bus) busItor.next();
            if (bus != null) {
                System.out.println(bus + " shown from station.");
            }
        }

    }


}
