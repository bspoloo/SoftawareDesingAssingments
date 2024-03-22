package bspo.Assingments.Pagination.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;

public class CommandExit<T> implements ICommand<T>{
    @Override
    public void execute(IPaginator paginator) {
        paginator.exit();
    }
}
