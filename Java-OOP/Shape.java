class Shape {

    int getCorner() {
        return 0;
    }

}

class Rectangle extends Shape {

    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        // super Keyword
        return super.getCorner();
    }

}