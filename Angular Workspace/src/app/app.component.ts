import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
  imagePath : string;

  constructor(){
    this.name = "Gladson";
    this.age = 21;
    this.email ="jpglad29@gmail.com";
    this.imagePath = "https://picsum.photos/200/300";
  }

  ChangeName(){
    this.name ="Ace";
  }

  ChangeAge(){
    this.age=22;
  }

  ChangeEmail(){

    this.email = "gladsonace29@gamil.com";
  }

  ChangeImage(){
    this.imagePath="https://lh3.googleusercontent.com/Ryg5ih-fOWbpEGDpbJYJz5RTq3_28Tvo2h3JQRCdiz16lw5ghitDMN6hcWA57g0d6_8VOqQYcCemRBOfZGQA64ZKkFOn71zuF1LDsXwCh4ywF-_z6VqxbBqmbQvK_-PWfZcztxDd1WDTEEUHX6GdP60";
  }
}
