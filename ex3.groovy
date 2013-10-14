String s = System.console().readLine()
int i = Integer.parseInt(s)

while (i<10){
    i++;
    String str = System.console().readLine()
    int j = Integer.parseInt(str)
    if (j==0){
    break;
    } else if (j!= -1){
    println j;
    }
}
System.out.println "finished"