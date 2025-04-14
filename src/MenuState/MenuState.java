package MenuState;

public enum MenuState {
    CHOOSING(-1),
    EXIT(0),
    ADDINCOME(1),
    ADDEXPENSES(2),
    SHOWTRANSACTIONS(3),
    SHOWBALANCE(4);

    private final int value;
    MenuState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MenuState fromValue(int value)throws IllegalAccessException {
    for(MenuState menuState : MenuState.values()) {
        if(menuState.getValue() == value) {
            return menuState;
        }
    }
    throw new IllegalAccessException("Invalid menu state");
    }
}
