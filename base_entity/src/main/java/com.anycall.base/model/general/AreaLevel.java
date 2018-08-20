package com.anycall.base.model.general;

import java.util.Arrays;

/**
 * Created by Robin on 16/7/11.
 */
public enum AreaLevel {
    //REGION(1),
    STATE(1),CITY(2),DISTRICT(3),STREET(4);

    private int value;

    private AreaLevel(int value) {

        this.value = value;

    }

    public int value() {
        return this.value;
    }

    public static int[] getValues() {
        return Arrays.stream(AreaLevel.values()).map(e->e.value).mapToInt( (Integer i) -> i.intValue()).toArray();
    }
}
