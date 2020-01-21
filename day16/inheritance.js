class Shape
{
    constructor(a)
    {
        this.x=a;
    }
}
class Square extends Shape
{
    area()
    {
        console.log('The area of a square is: '+this.x);
    }
}
var s1=new Square(5)
s1.area()