println "type something"
String s = System.console().readLine()

println s.size()

for (x in 0 .. (s.size()-1)) {
    println s.substring(x, x+1)
}