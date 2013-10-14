class Calculation {
Double x;
String operator;
Double y;
}

println "enter a number"
    String s = System.console().readLine()
    x = Double.parseDouble(s)
println "enter a number"
    String t = System.console().readLine()
    y = Double.parseDouble(t)
println "enter a thing to do (+, -, *, /)"
String operator = System.console().readLine()
Double z
if (operator == "+"){
    z = x+y
    } else if (operator == "-"){
    z = x-y
    } else if (operator == "*"){
    z = x*y
    } else if (operator == "/"){
    z = x/y
}
println z