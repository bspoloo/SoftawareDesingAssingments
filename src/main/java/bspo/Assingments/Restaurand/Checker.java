package bspo.Assingments.Restaurand;

import bspo.SoftwareDesing.Restaurant.Tables.ITable;
import bspo.SoftwareDesing.Restaurant.Tables.TableVacant;

public class Checker {
    public void checkTable(ITable table){

        if ( table instanceof TableVacant){
            System.out.println("Table is free");
        }else{
            System.out.println("Table is Occupied or Waiting for order");
            System.exit(0);
        }
    }
}
