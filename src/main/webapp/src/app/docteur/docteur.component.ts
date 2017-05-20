import { Component, OnInit } from '@angular/core';
import {DocteurService} from "./docteur.service";

@Component({
  selector: 'app-docteur',
  templateUrl: './docteur.component.html',
  styleUrls: ['./docteur.component.css']
})
export class DocteurComponent implements OnInit {
  private _children
  constructor(private _docteurService: DocteurService) { }

  ngOnInit() {
    this._docteurService.getChildren()
      .then(response => this._children = Object.assign(response.json()))
      .catch(error => console.log(error));
  }

}
