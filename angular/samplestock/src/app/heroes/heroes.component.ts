import { Component, OnInit, Input, EventEmitter,Output } from '@angular/core';
import { Hero } from './hero';
import { HEROES } from './mock-heroes';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})

export class HeroesComponent implements OnInit {

  heroes = HEROES;
  selectedHero: Hero;
message="Hello from child"
@Output() childMessage=new EventEmitter<string>();
  constructor() { }
    ngOnInit(){
    this.childMessage.emit(this.message);
  }

}