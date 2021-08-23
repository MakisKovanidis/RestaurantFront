package gr.kovanidis;

public final class UserDataHolder {

    private Integer tableId;
    private final static UserDataHolder INSTANCE = new UserDataHolder();

    private UserDataHolder() {}

    public static UserDataHolder getInstance() {
        return INSTANCE;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }
}
