import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './form/register/register.component';
import { LoginComponent } from './login/login.component';
import { UsersComponent } from './users/users.component';
import { HomeComponent } from './home/home.component';
import { NewcompanyComponent } from './newcompany/newcompany.component';
import { UpdateUserComponent } from './update-user/update-user.component';




const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:"register",component:RegisterComponent},
  {path:"login",component:LoginComponent},
  {path:"users",component:UsersComponent},
  {path:"newcompany",component:NewcompanyComponent},
  {path:"update-user",component:UpdateUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }