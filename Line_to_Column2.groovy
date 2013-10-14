println "type something"
String s = System.console().readLine()

println s.size()

for (x in 0 .. (s.size()-1)) {
    if (s.substring(x, x+1) == " "){
        println ""
    }
    print s.substring(x, x+1)
}