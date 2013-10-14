println "enter a number"
String s = System.console().readLine()
Integer a = Integer.parseInt(s)
println "enter another number"
String str = System.console().readLine()
Integer b = Integer.parseInt(str)
Integer c = 0

if (b>0) {
    while (b > 0) {
        c = c+a
        b=b-1
    }
} else { 
    println a
}
println c