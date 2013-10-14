println "make a choice 1-5"
println "1 for balance"
println "2 for purchases"
println "3 for refunds"

String s = System.console().readLine()
Integer choice = Integer.parseInt(s)


if (choice < 4) {

    switch (choice){
        case 1:
        println "balance"
            break;
        case 2:
            break;
        case 3:
            break;
    }
} else {
    println "That is not a valid option try again"
}