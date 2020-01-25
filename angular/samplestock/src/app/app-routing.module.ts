import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RegisterComponent} from './user/register/register.component'
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {path: 'register',component: RegisterComponent},
  { path :'service',component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
