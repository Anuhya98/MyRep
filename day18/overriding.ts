class Parent
{
    shows():any{
        console.log('Parent class')
    }
}
class Child extends Parent
{
    shows():any{
        console.log('Child class')
    }
}
var obj1=new Child()
obj1.shows()