import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {
  
  message: string;
  price: number;
  salary: number;
  dob: Date;

  constructor() { }
  ngOnInit() {
    this.message = "Hello and welcome to my demo";
    this.price = 50000;
    this.salary = 22000.500;
    this.dob = new Date(1990,0,20);
  }
}

  
