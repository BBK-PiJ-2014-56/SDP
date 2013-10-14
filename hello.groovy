print "hello "

Integer number
def l = []

Boolean flag = true

while (true){
    number = getIntegerWithPrompt("Please enter a positive number, end with minus 1")

    if (number == -1) break
    flag = false
    l. add(number)
}

if (flag)
    println "No numbers entered"

Integer getIntegerWithPrompt(String prompt){
    print prompt
    String str = System.console().readLine()
    return Integer.parseint(str)
    }