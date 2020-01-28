import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import { UserService } from 'src/app/services/user.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerUser:FormGroup;

  constructor(private formBuilder:FormBuilder,private userService:UserService) { }

  ngOnInit() {
    this.registerUser=this.formBuilder.group({
      id: ['', Validators.required],
      name: ['', Validators.required],
      email: ['',[Validators.required,Validators.required]],
      phone: ['', Validators.required]
    })
  }
addUser() 
{
   this.userService.saveUser(this.registerUser.value).subscribe(data =>{
     console.log('User inserted successfully');
   });
}
onSubmit()
{
  console.log(this.registerUser.value);
}
}
