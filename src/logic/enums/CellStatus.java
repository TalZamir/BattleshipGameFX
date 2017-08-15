package logic.enums;

public enum CellStatus {

    HIT('$'),
    MISS('#'),
    SHIP('@'),
    REGULAR('*'),
    MINE('+'),
    TEMP('&'),
    // TODO: Do we still need the 'W' sign?
    WIN('W'),
    SHOW_ALL('^');

    private char sign;

    CellStatus(char sign) {
        this.sign = sign;
    }

    public char sign() {
        return sign;
    }
}
