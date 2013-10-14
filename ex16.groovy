Integer counter1 = 0 
Integer counter2 = 0 

while (counter1 || counter2 < 3) {
    println "Enter result in capitals"
    String result = System.console().readLine()
    
    if (result == "PR" || result == "RS" || result == "SP"){
    println "P1 win!"
    counter1++
    }
    if (result == "RP" || result == "SR" || result == "PS"){
    println "P2 win!"
    counter2++
    }
}
if (counter1 == 3){
    println "P1 wins overall!"
    } else {
    println "P2 wins overall!"
    }
