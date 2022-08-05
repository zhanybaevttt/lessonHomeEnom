public enum Kundor {
    MONDAY("дуйгомбу куну жава окуйм"),
    TUESDAY("шейшемби куну практикалык сабак"),
    WEDNESDAY ("шаршемби куну жава окуйм B англис гили сабагын окуйм"),
    THURSDAY ("бейшемби куну практикалык сабак"),
    FRIDAY("жума куну жава сабагын окуйм"),
    SATURDAY("ишемби куну практикалык сабак окуйм"),
    SUNDAY("жекшемби куну эс алуу");

    String okuu;

    Kundor(String okuu) {
        this.okuu = okuu;
    }

    public String getOkuu() {
        return okuu;
    }

    public void setOkuu(String okuu) {
        this.okuu = okuu;
    }

    @Override
    public String toString() {
        return "Kundor{" +
                "okuu='" + okuu + '\'' +
                '}';
    }
}
