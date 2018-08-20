package com.anycall.base.model.general;

import java.util.Arrays;

/**
 * Created by Robin on 16/7/11.
 */
public enum ServiceCatalogLevelType {
    ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5);

    private int value;

    private ServiceCatalogLevelType(int value) {

        this.value = value;

    }

    public int value() {
        return this.value;
    }

    public static int[] getValues() {
        return Arrays.stream(ServiceCatalogLevelType.values()).map(e->e.value).mapToInt( (Integer i) -> i.intValue()).toArray();
    }
}
