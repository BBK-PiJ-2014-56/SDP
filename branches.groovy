println "make a choice 1-5"
println "1 for balance"
println "2 for purchases"
println "3 for refunds"

String s = System.console().readLine()
Integer choice = Integer.parseInt(s)

while (choice != -1)
    if (choice>3) {
        println "That is not a valid option try again"
    } else {
    switch (choice){
        case 1:
            break;
        case 2:
            break;
        case 3:
            break;
    }
}