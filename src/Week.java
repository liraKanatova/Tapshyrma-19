public enum Week {
    MONDAY("Дуйшөмбү куну жава окуйм"),
    TUESDAY("Шейшемби күнү англис тили окуйм"),
    WEDNESDAY("Шаршенби куну софт скиллс окуйм "),
    THURSDAY("Бейшенби куну жава сабагынан практика кылам"),
    FRIDAY("Жума куну англис тилин практика кылам"),
    SATURDAY("Ишенби куну бардык сабактарынын уй ишин жасайм "),
    SUNDAY("Жекшенби куну сабактарды кайталайм ");

    private String timeTable;

    Week(String timeTable) {
        this.timeTable = timeTable;
    }

    public String getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }

}
