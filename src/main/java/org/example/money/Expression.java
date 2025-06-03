package org.example.money;

interface Expression {
    Money reduce(Bank bank, String to);
}
