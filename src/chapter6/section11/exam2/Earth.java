package chapter6.section11.exam2;

public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_ARES;

    static {
        EARTH_SURFACE_ARES = 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
    }
}
