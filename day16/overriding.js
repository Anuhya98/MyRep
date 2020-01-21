'use strict mode'
class A
{
    print()
    {
        console.log('Anuhya');
    }
}
class B extends A
{
    print()
    {
        super.print()
        console.log('Anu');
    }
}
var b1=new B()
b1.print()