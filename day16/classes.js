class Hello
{
    constructor(fname,lname,age)
    {
        this.fn=fname;
        this.ln=lname;
        this.a=age;
    }
    fullname()
    {
        return this.fn+' '+this.ln;
    }
}
let h1=new Hello('Anu','Lingamallu',21)
console.log('Full name is :'+h1.fullname())