println "make a choice 1-5"
println "1 for balance"
println "2 for purchases"
println "3 for refunds"

String s = System.console().readLine()
enum s {
a,
b,
c,
}

    switch (s) {
        case a:
            println "balance"

            break;
        case b:
            println "purchases"

            break;    
        case c:
            println "refunds"

            break;
        default:
            println "try again"
            break;
    }