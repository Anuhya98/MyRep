var f1=function(x,y)
{
    return x*y
}
function multiply()
{
    var result
    result=f1(2,8)
    console.log("The result of product is: "+result)
}
multiply()
var f2=new Function("a","b","return a+b;")
function add()
{
    var answer
    answer=f2(3,7)
    console.log("The result of addition is :"+answer)
}
add()