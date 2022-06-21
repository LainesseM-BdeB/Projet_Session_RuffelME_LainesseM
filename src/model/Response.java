package model;

public class Response {

    private final boolean isOver;
    private final Double nonRemboursable;

    public Response(boolean isOver, Double nonRemboursable) {
        this.isOver = isOver;
        this.nonRemboursable = nonRemboursable;
    }

    public boolean isOver() {
        return isOver;
    }

    public Double getNonRemboursable() {
        return nonRemboursable;
    }

}
