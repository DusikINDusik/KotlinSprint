package org.example.Lesson2

fun main () {
    var quantityEmployees = 50
    var paymentForOneEmployee = 30000
    var salaryExpensesEmployees = (quantityEmployees * paymentForOneEmployee)

    println(salaryExpensesEmployees)

    var quantityIntern = 30
    var paymentForOneIntern = 20000
    var salaryExpensesIntern = (quantityIntern * paymentForOneIntern)
    var expensEmployeIntern = salaryExpensesIntern + salaryExpensesEmployees

    println(expensEmployeIntern)

    var averageValue = (expensEmployeIntern) / (quantityIntern + quantityEmployees)

    println(averageValue)
}