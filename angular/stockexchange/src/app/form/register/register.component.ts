import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

registerForm: FormGroup;
submit()
{
  console.log(this.registerForm.value);
}
  constructor() { }

  ngOnInit() {
    this.registerForm=new FormGroup({
      'empEmailId':new FormControl(null),
      'phoneno':new FormControl(null),
      'username':new FormControl(null),
      'password':new FormControl(null),
      'confirmpassword':new FormControl(null)
    })
  }

}
