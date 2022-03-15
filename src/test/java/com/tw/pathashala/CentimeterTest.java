package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CentimeterTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Centimeter oneCentimeter = Centimeter.createCentimeter(1);
        Centimeter anotherOneCentimeter = Centimeter.createCentimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Centimeter oneCentimeter = Centimeter.createCentimeter(1);
        Centimeter twoCentimeter = Centimeter.createCentimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }

    @Test
    void should_equate_100_cm_to_1_m() {
        Centimeter hundredCentimeter = Centimeter.createCentimeter(100);
        Centimeter oneMeter = Centimeter.createMeter(1);

        assertThat(hundredCentimeter, is(equalTo(oneMeter)));
    }


    @Test
    void should_equate_100_cm_to_0_point_001_km() {
        Centimeter hundredCentimeter = Centimeter.createCentimeter(100);

        Centimeter zeroZeroZeroOneKilometer = Centimeter.createKilometer(0.001);
        assertThat(hundredCentimeter, is(equalTo(zeroZeroZeroOneKilometer)));
    }
}

