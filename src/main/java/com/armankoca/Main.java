package com.armankoca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int income = 0;
        int bubbleGumIncome = 202;
        income += bubbleGumIncome;
        int toffeeIncome = 118;
        income += toffeeIncome;
        int iceCreamIncome = 2250;
        income += iceCreamIncome;
        int milkChocolateIncome = 1680;
        income += milkChocolateIncome;
        int doughnutIncome = 1075;
        income += doughnutIncome;
        int pancakeIncome = 80;
        income += pancakeIncome;

        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d\n", bubbleGumIncome);
        System.out.printf("Toffee: $%d\n", toffeeIncome);
        System.out.printf("Ice cream: $%d\n", iceCreamIncome);
        System.out.printf("Milk chocolate: $%d\n", milkChocolateIncome);
        System.out.printf("Doughnut: $%d\n", doughnutIncome);
        System.out.printf("Pancake: $%d\n", pancakeIncome);
        System.out.println();
        System.out.printf("Income: $%d\n", income);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        int netIncome = income - (staffExpenses + otherExpenses);
        System.out.printf("Net income: $%d\n", netIncome);
    }
}