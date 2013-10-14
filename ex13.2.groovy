
Integer a = 10
Integer b = a
Integer c
while (b>0) {
    b = b - 1  
    c = a%b
    println "c= " + c
    if (c == 0){
        println "not prime"
        break;
    } else {
        println "prime"
    }
}