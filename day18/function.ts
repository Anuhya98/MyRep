function add(a:string, b:string):string;

function add(a:any, b:number): number;

function add(a:any, b:any): any {
    return a + b;
}

var concat=add("Hello ", "Anu"); // returns "Hello Steve" 
console.log(concat);
 var sum=add(10, 20); // returns 30 
console.log(sum);
