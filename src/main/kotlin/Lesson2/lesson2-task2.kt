package org.example.Lesson2

fun main () {
    var quantityEmployees = 50
    var paymentForOneEmployee = 30000
    var salaryExpensesEmployees = (quantityEmployees * paymentForOneEmployee)

    println(salaryExpensesEmployees)

    var quantityIntern = 30
    var paymentForOneIntern = 20000
    var salaryExpensesIntern = (quantityIntern * paymentForOneIntern)
    var ExpensEmployeIntern = salaryExpensesIntern + salaryExpensesEmployees

    println(ExpensEmployeIntern)

    var averageValue = (ExpensEmployeIntern) / (quantityIntern + quantityEmployees)

    println(averageValue)


}