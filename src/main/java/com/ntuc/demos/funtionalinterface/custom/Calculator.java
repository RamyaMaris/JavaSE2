
package com.ntuc.demos.funtionalinterface.custom;
@FunctionalInterface
public interface Calculator<P> {
    P operation(P n1, P n2);
}
