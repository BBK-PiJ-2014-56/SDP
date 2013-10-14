import java.lang.Math

class Point {
    double x;
    double y;
}


Point a = new Point()
Point b = new Point()
Point c = new Point()

a.x = 1
a.y = 1

b.x = 2
b.y = 2

c.x = 3
c.y = 3

double ab = Math.pow(((a.x-b.x)**2 + (a.y-b.y)**2), 0.5)
double bc = Math.pow(((c.x-b.x)**2 + (c.y-b.y)**2), 0.5)
double ac = Math.pow(((a.x-c.x)**2 + (a.y-c.y)**2), 0.5)

println "Distance between a and b = " + Math.pow(((a.x-b.x)**2 + (a.y-b.y)**2), 0.5)

println "Distance between b and c = " + Math.pow(((c.x-b.x)**2 + (c.y-b.y)**2), 0.5)

println "Distance between a and c = " + Math.pow(((a.x-c.x)**2 + (a.y-c.y)**2), 0.5)

