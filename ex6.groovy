

println "enter a number"
String s = System.console().readLine()
Integer a = Integer.parseInt(s)
println "enter another number"
String str = System.console().readLine()
Integer b = Integer.parseInt(str)
Integer c = a
Integer d = 0
if (b>0) {
    while (c > 0) {
        c = c-a
        d++
    }
} else { 
    println "Can't divide"
}
println d