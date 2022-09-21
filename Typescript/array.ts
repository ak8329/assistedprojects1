let n1:number[]=[];
let n2:Array<number>=[];
let n3:Array<number>=new Array();
n1.push(20);
n1.push(30);
let names:string[]=new Array();
let info:any[]=new Array();
info.push(20);
info.push("krish");
info.push(true);
//thid interface is used to make type of object5
interface Emp{
    id:number;
    name:string;
    age:number;
}
let e1:Emp={id:100,name:"krish",age:20}
let e2:Emp={id:101,name:"ravi",age:20}
//create array obj to add or push data
let employee: any[]=new Array();
employee.push(e1);
employee.push(e2);
employee.forEach(e=>console.log(e.id+" "+e.name+" "+e.age));
let r=employee.find(e=>e.id==100);
let r1=employee.find(e=>e.age==200);
console.log(r);
console.log(r1);