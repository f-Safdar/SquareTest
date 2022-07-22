package com.example;

public record Square(int side) {
    public int calcArea() {
        return side * side;
    }

    public int calcPerimeter() {
        return 4 * side;
    }

    public int getCenter() {
        return (side * side) / 2;
    }

//    public int checkNegatives() {
//        if(side < 0){
//            return
//        }
//    }
}

