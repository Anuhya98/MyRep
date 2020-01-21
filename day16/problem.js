
var a1=new Array(10)
for(var i=0;i<a1.length;i++)
{
    a1[i]=Math.floor(Math.random()*100)
}
    var b1=a1.filter((a) => ((a%2==0)&&(a%5==0)))
    console.log('The value divisble by 2 and 5 are :' +b1);
    var m1=a1.map((x) => parseInt(x*1.1))
    console.log('The map value is: '+m1);
