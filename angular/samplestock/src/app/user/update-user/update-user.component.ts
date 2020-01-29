import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
updateUser:FormGroup;
  constructor(private formbuilder: FormBuilder,private userService:UserService, private router:Router) { }

  ngOnInit() {
  this.updateUser=this.formbuilder.group({
    id:[],
    name:['',Validators.required],
    email:['',[Validators.required,Validators.email]],
    phone:['',Validators.required]
  });
  const id=localStorage.getItem('userId');
  if (+id > 0){
    this.userService.getUserById(+id).subscribe(user =>{
      this.updateUser.patchValue(user);
    });
  }
}
  updateTheUser(user:User){
    this.userService.updateUserInfo(this.updateUser.value).subscribe( u => {
     this.router.navigate(['users']);
    });
  }
  }


