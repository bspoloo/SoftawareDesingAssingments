package bspo.Assingments.Pagination.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;

public interface ICommand<T> {
    void execute(IPaginator paginator);
}
