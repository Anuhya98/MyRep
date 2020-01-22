export class Employee
{
     id : number;
     name : string;
     dob : Date;
     constructor(id:number,name:string,dob:Date)
     {
         this.id=id;
         this.name=name;
         this.dob=dob;

     }
    
}
let employee=new Employee(503,'Anu',new Date());
console.log('Employee name is :'+employee.name);
console.log('Employee id is :'+employee.id);
console.log('Date of birth :'+employee.dob);