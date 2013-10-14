println "make a choice 1-5"
println "1 for balance"
println "2 for purchases"
println "3 for refunds"



flag = true

while (flag == true){
String s = System.console().readLine()
Integer choice = Integer.parseInt(s)
    switch (choice) {
        case 1:
            println "balance"
            flag = false
            break;
        case 2:
            println "purchases"
            flag = false
            break;    
        case 3:
            println "refunds"
            flag = false
            break;
        default:
            println "try again"
            break;
    }
}
System.out.println "finished"