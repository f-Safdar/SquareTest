package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;

    @BeforeEach
    void setUp() {
        square = new Square(5);
    }

    @Test
    void side() {
        assertEquals(5, square.side());
    }

    @Test
    void calcArea() {
        assertEquals(5 * 5 , square.calcArea());    // area of the square = side * side
    }

    @Test
    void calcPerimeter() {
        assertEquals(4 * 5, square.calcPerimeter());    // Perimeter of the square = 4 * side
    }

    @Test
    void getCenter() {
        assertEquals((5 * 5) / 2, square.getCenter());  // coordinates of the center of the square = side * side / 2
    }

//    @Test
//    void checkNegatives() {
//        assertEquals(0, square.checkNegatives());
//    }
}