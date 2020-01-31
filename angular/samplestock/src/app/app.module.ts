import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {AppRoutingModule} from './app-routing.module'
import { AppComponent } from './app.component';
import { HighlightDirective } from './highlight.directive';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './user/users/users.component';
import {HttpClientModule} from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import {RegisterComponent} from './user/register/register.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { PipeComponent } from './pipes/pipe/pipe.component';
import { CustompipePipe } from './custompipe.pipe';

@NgModule({
  imports: [ BrowserModule ,AppRoutingModule, HttpClientModule,ReactiveFormsModule],
  declarations: [
    AppComponent,
    HighlightDirective,
    HomeComponent,
    RegisterComponent,
    UsersComponent,
    UpdateUserComponent,
    PipeComponent,
    CustompipePipe
  ],
  providers:[],
  bootstrap: [ AppComponent ]
})
export class AppModule { }