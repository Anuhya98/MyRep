"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id, name, dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    return Employee;
}());
exports.Employee = Employee;
var employee = new Employee(503, 'Anu', new Date());
console.log('Employee name is :' + employee.name);
console.log('Employee id is :' + employee.id);
console.log('Date of birth :' + employee.dob);
