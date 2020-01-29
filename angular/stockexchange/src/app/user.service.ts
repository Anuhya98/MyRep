import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './models/user';


@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl = 'http://localhost:3000/';

  
  constructor(private httpClient:HttpClient) { }
  getALLUsers() :Observable<User[]>
  {
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  
}
