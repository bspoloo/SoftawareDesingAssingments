package bspo.Assingments.Restaurand.Tables;

public class FactoryTables {
    public static ITable getTable(int number, String status) {
        switch (status) {
            case "occupied":
                return new TableOccupied(number, status);
            case "vacant":
                return new TableVacant(number, status);
            case "waiting":
                return new TableWaiting(number, status);
            default:
                return null;
        }
    }
}
