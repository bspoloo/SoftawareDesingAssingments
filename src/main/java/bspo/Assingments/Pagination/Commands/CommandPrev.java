package bspo.Assingments.Pagination.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;
import bspo.SoftwareDesing.Exercise3Corrected.Page;

public class CommandPrev<T> implements ICommand<T>{
    @Override
    public void execute(IPaginator paginator) {
        Page pagePrev = paginator.prev();
        pagePrev.print();
        pagePrev.menu();
    }
}
