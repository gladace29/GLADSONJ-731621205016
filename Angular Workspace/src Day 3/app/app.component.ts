import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // name : string;
  // age : number;
  // email : string;
  // imagePath : string;
  // fname : String;
  // flag : boolean;
  // vehicles : string[];
  // selectedVehicle : string;
  // myStyle : {};
  // myClass : string;
  sum : number;
  

  constructor(private calc : CalculatorService){
    this.sum = calc.getAddition(10,20);
    // this.name = "Gladson";
    // this.age = 21;
    // this.email ="jpglad29@gmail.com";
    // this.imagePath = "https://picsum.photos/200/300";
    // this.fname = "";
    // this.flag = true;
    // this.vehicles = ["TwoWheeler","ThreeWheeler","FourWheeler"];
    // this.selectedVehicle = "";
    // this.myStyle = {'width' : '40%','border':'2px solid green'};
    // this.myClass = "MyClass1";
  }

  // ChangeName(){
  //   this.name ="Ace";
  // }

  // ChangeAge(){
  //   this.age=22;
  // }

  // ChangeEmail(){

  //   this.email = "gladsonace29@gamil.com";
  // }

  // ChangeImage(){
  //   this.imagePath="https://lh3.googleusercontent.com/Ryg5ih-fOWbpEGDpbJYJz5RTq3_28Tvo2h3JQRCdiz16lw5ghitDMN6hcWA57g0d6_8VOqQYcCemRBOfZGQA64ZKkFOn71zuF1LDsXwCh4ywF-_z6VqxbBqmbQvK_-PWfZcztxDd1WDTEEUHX6GdP60";
  // }

  // ChangeFlag(){
  //   this.flag = ! this.flag;
  // }

  // setSelectedItem(vec : string){
  //  this.selectedVehicle = vec;
  // }

  // ChangeStyle(){
  //   this.myStyle = {'width' : '40%','border':'2px solid aqua'};
  // }
}


