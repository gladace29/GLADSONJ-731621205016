import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-glad',
  templateUrl: './glad.component.html',
  styleUrl: './glad.component.css'
})
export class GladComponent {
  sum : number;
  sub : number;


constructor(private calc : CalculatorService){
  this.sum = calc.getAddition(10,20);
  this.sub = calc.getSubtraction(20,10);
}
}