package com.go.interview;

interface Computable <A, V> {
    V compute(A arg) throws InterruptedException;
}