import { Component } from '@angular/core';

interface Employee {
  id: number;
  name: string;
  date: string;
  time: number; 
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employees: Employee[] = [
    { id: 16, name: 'Glad', date: "1-8-2024" , time : 9},
    { id: 63, name: 'Yash', date: "1-8-2024" , time : 9},
    { id: 14, name: 'Diva', date: "1-8-2024" , time : 9}
  ];
  employee: Employee = { id: 0, name: '', date: "0" , time: 0};
  message: string = '';

  saveEmployee() {
    this.employees.push({ ...this.employee });
    this.message = `ID ${this.employee.id} Present`;
    this.clearEmployee();
  }
 
  absentEmployee(){
    this.employees.push({ ...this.employee });
    this.message = `ID ${this.employee.id} Absent`;
    this.clearEmployee();
  }
 

  deleteEmployee() {
    this.employees = this.employees.filter(e => e.id !== this.employee.id);
    this.message = `Record ${this.employee.id} Deleted`;
    this.clearEmployee();
  }

  clearEmployee() {
    this.employee = { id: 0, name: '', date: "0" , time:0};
  }
}
